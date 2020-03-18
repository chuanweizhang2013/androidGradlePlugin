package  com.hc.second

import org.gradle.api.Plugin
import org.gradle.api.Project

public class SecondPlugin implements Plugin<Project> {

    void apply(Project project1) {
        System.out.println("========================");
        System.out.println("Hello SecondPlugin gradle plugin!");
        System.out.println("========================");
        //下面这个是监听Debug 生成dex文件的时候task
       /* project1.afterEvaluate { project ->
            project.tasks.transformDexArchiveWithDexMergerForDebug << {
                println 'add my own step from plugin'
                //Get the inputs of this task

                project.tasks.transformDexArchiveWithDexMergerForDebug.getInputs().getFiles().collect().each { element1 ->
                    println "inputs " + element1
                }
                //Get the outputs of this task
                project.tasks.transformDexArchiveWithDexMergerForDebug.getOutputs().getFiles().collect().each() { element ->
                    def file = new File(element.toString())
                    def files = file.listFiles()
                    def files2 = files[0].listFiles()
                    String dexfilepath = files2[0]
                    println "Outputs Dex file's path: "+dexfilepath
                    //Modify the dex 可先注释掉
//                    testRewrite(dexfilepath)
                }
            }
        }
        */
    }
}