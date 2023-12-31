<?php

// The data to send
$data = array('text' => 'Your text here');
$data_string = json_encode($data);

// Initialize cURL session
$ch = curl_init('https://tools.casrai.org/generate-metadata');

// Set cURL options
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
curl_setopt($ch, CURLOPT_POSTFIELDS, $data_string);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
    'Content-Type: application/json',
    'Content-Length: ' . strlen($data_string))
);

// Execute POST request and close cURL session
$result = curl_exec($ch);
curl_close($ch);

// Output the result
echo $result;
?>
