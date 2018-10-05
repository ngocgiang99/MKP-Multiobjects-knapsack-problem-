class Individual {
    int fitness, wfiness, size;
    int[] objects = new int[Configs.N_OBJ];

    public Individual() {
        this.fitness = 0;
        this.size = Configs.N_OBJ;

        for(int i = 0; i < Configs.N_OBJ; ++i)
            this.objects = 0;
    }

    void calcfitness() {
        fitness = 0;
        wfitness = 0;

        for(int i = 0; i < Configs.N_FC_OBJ; ++i) {
            int res = 0;
            for(int j = 0; j < size; ++j) {
                res += objects[j]*Configs.v[i][j];
            }

            if (res > fitness) fitness = res;
        }

        for(int i = 0; i < size; ++j)
            wfitness += objects[i] * Configs.w[i];

    }

}