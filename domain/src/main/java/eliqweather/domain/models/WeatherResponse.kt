package eliqweather.domain.models

import com.google.gson.annotations.SerializedName

/**
 * @Author: Shahab Azimi
 * @Date: 2023 - 09 - 02
 **/
data class WeatherResponse(
    val daily: Daily,
    @SerializedName("daily_units")
    val dailyUnits: DailyUnits,
    val elevation: Double,
    @SerializedName("generationtime_ms")
    val generationTime: Double,
    val hourly: Hourly,
    @SerializedName("hourly_units")
    val hourlyUnits: HourlyUnits,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    @SerializedName("timezoneAbbreviation")
    val timezone_abbreviation: String,
    @SerializedName("utc_offset_seconds")
    val utcOffsetInSeconds: Int
)