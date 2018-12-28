package com.meditab.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck electricDuck = new electricDuck();
        quack(electricDuck);
        swim(electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}