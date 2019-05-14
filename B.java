//name:tayler Wright
//date:5-14-19
//Write	the	declaration	for	class	B. The class’s members should be as follows
// Next, write the declaration for class D, which extends class B. The class’s members should be as follows


class B
{
    private int m;

    protected int n;

    public int getM()
    {
        return m;
    }

    public void setM(int m)
    {
        this.m = m;
    }

    public int getN()
    {
        return n;
    }

    public void setN(int n)
    {
        this.n = n;
    }
}

class D extends B
{

    private double q;

    double r;

    public double getQ()
    {
        return q;
    }

    public void setQ(double q)
    {
        this.q = q;
    }

    public double getR()
    {
        return r;
    }

    public void setR(double r)
    {
        this.r = r;
    }
}