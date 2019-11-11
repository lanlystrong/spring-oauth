package org.spring.oauth.auth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;

/**
 * @author llg
 * @description 异常
 * @date 2019/11/11
 */
@Configuration
public class WebResponseExceptionTranslateConfig extends DefaultWebResponseExceptionTranslator {
}
