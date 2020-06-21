package za.co.awesomatic

import com.amazonaws.services.lambda.runtime.Context

class LambdaFunctionHandler {
    String myHandler(data, Context context) {
        context.logger.log "data received in lambda function handler: $data"
        "${data}"
    }
}
