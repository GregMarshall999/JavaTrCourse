package noise;

import java.util.Random;

public class PerlinNoise
{
    private int octaves;
    private float[] seed;

    public PerlinNoise(int seedSize)
    {
        seed = new float[seedSize];
        octaves = 1;
    }

    private void generateSeed()
    {
        Random r = new Random();

        for(int i = 0; i < seed.length; i++)
        {
            seed[i] = r.nextFloat();
        }
    }

    public float[] perlin1DNoise(int count)
    {
        float[] output = new float[count];
        generateSeed();

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
                scale = scale / 2.0f;
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
        octaves = 1;
    }

    public void incrementOctave()
    {
        octaves++;
        if(octaves > 5)
        {
            octaves = 1;
        }
    }
}
