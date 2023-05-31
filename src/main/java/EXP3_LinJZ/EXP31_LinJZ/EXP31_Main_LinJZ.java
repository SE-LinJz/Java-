package EXP3_LinJZ.EXP31_LinJZ;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author linjz
 */
public class EXP31_Main_LinJZ {
        public static void main(String[] args) throws Exception{


            File file = new File("Student.txt");
            Scanner x = new Scanner(System.in);

            while(true){
                System.out.println("请选择操作：1、输入数据写入文件;2、从文件中读出;其他、退出");
                String choice = x.next();

                if(Objects.equals(choice, "1")) {
                    String clazz,num,name,grade;
                    System.out.println("请输入学生数量：");
                    int stuNum = x.nextInt();
                    EXP31_Student_LinJZ[] stu = new EXP31_Student_LinJZ[stuNum+1];
                    for(int i=1;i<=stuNum;i++) {
                        System.out.println("请输入第"+i+"个学生年级");
                        grade = x.next();
                        System.out.println("班级");
                        clazz = x.next();
                        System.out.println("学号");
                        num = x.next();
                        System.out.println("姓名");
                        name = x.next();
                        stu[i-1] = new EXP31_Student_LinJZ(grade,clazz,num,name);
                    }
                    writeFile(file, stu);
                    System.out.println("成功写入文件！");
                    System.out.println("学生信息如下：");
                    readFile(file);
                }
                else if(Objects.equals(choice, "2")) {
                    System.out.println("学生信息如下：");
                    readFile(file);
                }else {
                    return;
                }
            }

        }
        public static void writeFile(File file, EXP31_Student_LinJZ[] stu) throws IOException{//写入文件
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (EXP31_Student_LinJZ student : stu) {
                if(student != null){
                    bw.write("年级"+student.grade+" \t班级"+student.clazz+"\t学号"+student.num+"\t姓名"+student.name);
                    bw.newLine();
                }
            }

            bw.close();
            fw.close();
        }

        public static void readFile(File file) throws IOException {//读取文件
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.printf(s);
                System.out.println();
            }
            br.close();
            fr.close();
        }



}
