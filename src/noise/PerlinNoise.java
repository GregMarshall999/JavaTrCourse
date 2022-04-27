package noise;

import java.util.Random;

public class PerlinNoise
{
    private int count, octaves;
    private float bias;
    private float[] seed;

    public PerlinNoise(int seedSize)
    {
        seed = new float[seedSize];
        generateSeed();
        count = 1;
        octaves = 1;
        bias = 2.0f;
    }

    /**
     * Generates new seed
     */
    public void generateSeed()
    {
        Random r = new Random();

        for(int i = 0; i < seed.length; i++)
        {
            seed[i] = r.nextFloat();
        }
    }

    /**
     * Decrements bias by 0.2
     * Min set to 0.2f!! Division by 0 in perlin1DNoise!!
     */
    public void decrementBias()
    {
        float f = bias == 0.0f ? 1.0f : 0.0f;
        bias = f*0.2f + (1.0f-f)*(bias-0.2f);
    }

    /**
     * Increments bias by 0.2
     */
    public void incrementBias()
    {
        bias += 0.2f;
    }

    /**
     * Increments octave, smoothing the noise in the process
     * Resets to first octave if over the max sampling
     */
    public void incrementOctave()
    {
        octaves++;                                      //increment octaves
        int next8 = count/8;                            //Normalizes size to smallest multiple of 8
        int maxOctave = (int)Math.sqrt(8*next8) + 1;    //Gets the smallest square of 2 to the count
        int isOverMax = octaves > maxOctave ? 1 : 0;    //tests if the octave is greater than the maximum
        octaves = isOverMax + (1-isOverMax)*octaves;  //changes octaves depending on bool condition
    }

    /**
     * 1D noise generator.
     * @param count - Size of the noise array to generate
     * @return output - Noise array returned
     */
    public float[] perlin1DNoise(int count)
    {
        this.count = count;
        float[] output = new float[count];

        for(int x = 0; x < count; x++)
        {
            float noise = 0.0f;
            float scale = 1.0f;
            float scaleAcc = 0.0f;

            for(int o = 0; o < octaves; o++)
            {
                int pitch = count >> o;
                int sample1 = (x / pitch) * pitch;
                int sample2 = (sample1 + pitch) % count;

                float blend = (float)(x - sample1) / (float)pitch;
                float sample = (1.0f - blend) * seed[sample1] + blend * seed[sample2];
                noise += sample * scale;
                scaleAcc += scale;
                scale = scale / bias;
            }

            output[x] = noise / scaleAcc;
        }

        return output;
    }

    /**
     * Reset seed array to new size
     * @param seedSize - Size of seed array
     */
    public void newSeedSize(int seedSize)
    {
        seed = new float[seedSize];
    }
}
