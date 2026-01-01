/*Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem */
public class Cost {
    public static void main(String[] args) {
        float pencil = 10.5f;
        float pen = 20.0f;
        float eraser = 5.5f;
        float total = pencil + pen + eraser;
        System.out.println("Total cost of the items is: " + total);
        //with gst 18%
        float gst = total * 0.18f;
        float finalAmount = total + gst;
        System.out.println(String.format("The total  gst is %.2f",gst));
        System.out.println(String.format("The final amount after adding gst is %.2f",finalAmount));
    }
}
