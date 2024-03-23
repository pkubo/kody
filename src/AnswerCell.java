public class AnswerCell {
    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep == true)
        {
            System.out.println(false);
        }
        else
        {
            if(isMorning == false )
            {
                System.out.println(true);
            }
            else
            {
                if(isMom == true)
                {
                    System.out.println(true);
                }
                else
                {
                    System.out.println(false);
                }
            }
        }
    }

}
