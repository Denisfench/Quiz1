
public class Baseball {
	private String name;
	private int Hits;
	private int AB;
	private int BB;
	private int R;
	private int doubles;
	private int triples;
	private int HR;
	private int HBP;
	private int SF;
	

	
		
	public Baseball(String name, int hits, int aB, int bB, int r, int doubles, int triples, int hR, int hBP, int sF) {
		super();
		this.name = name;
		Hits = hits;
		AB = aB;
		BB = bB;
		R = r;
		this.doubles = doubles;
		this.triples = triples;
		HR = hR;
		HBP = hBP;
		SF = sF;
	}

	

	public int getHits() {
		return Hits;
	}

	public void setHits(int hits) {
		Hits = hits;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}
	public int Singles()
	{
		return  this.Hits - this.doubles - this.triples - this.HR;
	}
		

	public double SLG() {
		
		double slg = (Double.valueOf(this.Singles()) + (2 * Double.valueOf(this.doubles)) + (3 * Double.valueOf(this.triples))
				+ (4 * Double.valueOf(this.HR))) / Double.valueOf(this.AB);
		return slg;

	}
	
	public double AVG()
	{
		return (Double.valueOf(this.Hits)) / (Double.valueOf(this.AB));
		
	}
	public double BBP()  
	{
		return ((Double.valueOf(this.Hits) + Double.valueOf(this.BB) + Double.valueOf(this.HBP))) / ((Double.valueOf(this.AB)
				+ Double.valueOf(this.BB) + Double.valueOf(this.HBP)));
				
	}
	public double OBS() 
	{
		return Double.valueOf(this.BBP()) + Double.valueOf(this.SLG());
	}
	public double TB() 
	{
		return (Double.valueOf(this.Singles()) + (2 * Double.valueOf(this.doubles)) + (3 * Double.valueOf(this.triples))
				+ (4 * Double.valueOf(this.HR)));
	}

	public int getHBP() {
		return HBP;
	}

	public void setHBP(int hBP) {
		HBP = hBP;
	}

}

