$threshold = 80

while ($true) {
    $cpuUsage = Get-Counter '\Processor(_Total)\% Processor Time' | Select-Object -ExpandProperty CounterSamples | Select-Object -ExpandProperty CookedValue
    if ($cpuUsage -ge $threshold) {
        Write-Host "CPU usage is above threshold ($cpuUsage%)."
    }
    Start-Sleep -Seconds 10
}
