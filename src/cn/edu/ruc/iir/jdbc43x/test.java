package cn.edu.ruc.iir.jdbc43x;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			long b = System.currentTimeMillis();
			Class.forName("cn.edu.ruc.iir.jdbc43x.Driver");
			Properties info = new Properties();
			info.setProperty("rdf3xembedded", "/home/hadoop/usr/rdf3x-0.3.7/rdf3xembedded");
			java.sql.Connection conn = DriverManager.getConnection("rdf3x:///home/hadoop/usr/rdf3x-0.3.7/C0S0.3x", info);
			java.sql.Statement st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery("select ?x ?y where {?x <publicationAuthor> ?y}");
			FileWriter fw = new FileWriter("/home/hadoop/testRes");
			BufferedWriter writer = new BufferedWriter(fw);
			while (rs.next())
			{
				writer.write(rs.getString(1) + " " + rs.getString(2) + "\n");
			}
			rs.close();
			st.close();
			conn.close();
			writer.close();
			System.out.println(System.currentTimeMillis() - b);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ArrayList<String> a = new ArrayList<String>();
		//System.out.println(a.getClass().toString());
		//System.out.println(Arrays.toString(a.getClass().getTypeParameters()));
		Test<String> a = new Test<String>();
		a.a = "a";
		a.f("");
		Test<Double> b = new Test<Double>();
		b.f(new Double(1));
	}

}
