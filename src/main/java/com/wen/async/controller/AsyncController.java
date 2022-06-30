package com.wen.async.controller;

import com.wen.async.service.AsyncService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 异步任务 Controller
 * </p>
 *
 * @author wenjun
 * @since 2022-06-30
 */
@RestController
@AllArgsConstructor
public class AsyncController {

    private final AsyncService asyncService;

    @GetMapping("/async")
    public void async() {
        asyncService.executeAsync();
    }
}
