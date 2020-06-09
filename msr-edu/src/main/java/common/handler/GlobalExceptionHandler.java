package common.handler;

/**
 * @author tom
 * @version V1.0
 * @Package common.handler
 * @date 2020/6/8 23:54
 * @Copyright ©
 */

import com.baomidou.mybatisplus.annotation.TableField;
import common.constants.ResultCodeEnum;
import common.exception.MSRException;
import common.util.ExceptionUtil;
import common.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error();
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }
    @TableField(value = "is_deleted")
    private Boolean deleted;

    //添加异常处理方法

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public R error(JsonParseException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }
    //或者下面的添加异常处理方法

//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    @ResponseBody
//    public R error(HttpMessageNotReadableException e){
//        e.printStackTrace();
//        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
//    }

    @ExceptionHandler(MSRException.class)
    @ResponseBody

    public R error(MSRException e){
        //e.printStackTrace();//打印堆栈输出信息

        //log.error(e.getMessage());
        //将错误日志输出到文件 类上添加注解@Slf4j 写log.error(e.getMessage());注释掉//e.printStackTrace();

        log.error(ExceptionUtil.getMessage(e));
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}
