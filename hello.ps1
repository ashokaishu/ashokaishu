$eventLog = Get-WinEvent -LogName Application -MaxEvents 100 | Where-Object { $_.LevelDisplayName -eq "Error" }
$eventLog | Format-Table TimeCreated, Id, Message -AutoSize
