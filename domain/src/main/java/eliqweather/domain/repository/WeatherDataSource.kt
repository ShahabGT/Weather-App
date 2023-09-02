package eliqweather.domain.repository

import eliqweather.domain.models.WeatherInfoModel
import eliqweather.domain.utils.ResultEntity

/**
 * @Author: Shahab Azimi
 * @Date: 2023 - 09 - 02
 **/
interface WeatherDataSource {
    suspend fun getWeatherLocation(request: WeatherInfoModel.request): ResultEntity<WeatherInfoModel.response>

}