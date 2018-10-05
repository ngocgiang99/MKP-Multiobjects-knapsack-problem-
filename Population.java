class Population {
    int sizepop;
    Individual[] individuals = new Individual[Configs.N_POP];
     
    public Population()  {
        this.sizepop = Configs.N_POP;

        for(int i = 0; i < this.size; ++i)
            individuals[i] = new Individual();
    }

    public Individual Crossover(Individual o1, Individual o2) {
        
    }

    public Individual Mutation(Individual obj) {

    }

    public void Selection() {

    }

    public void CalculateFitness() {

    }

}