# CASRAI.org Credit Taxonomy Project API Examples

## Introduction
This repository contains examples of how to make POST requests to the CASRAI Credit Taxonomy Project's specified endpoint using different programming languages. The purpose is to provide a clear and easy way for researchers and developers to integrate with our API, enhancing research contribution documentation.

### Actual Response to Below Research Contribution Summary

Find in Directory - End Point Output

Or try our web-based version at https://casrai.org/credit for individual processing without having to use our API. 

## How to Use
Each file in main contains complete code samples for a specific programming language: Curl, Python, PHP, and Java. Follow the instructions in each file to run the examples.

Curl (Command Line)
```bash
curl -X POST -H "Content-Type: application/json" -d '{"text":"Your Research Contribution Summary Here... See below for example used in output direcotry."}' https://tools.casrai.org/generate-metadata

Example Research Summary    

Below you find a summary of contributions for a research paper, where each team member send their contributions via email in natural language to the research administration manager. Using the endpoint tools.casrai.org, you will get a response from our Llama 2 AI model traned in CRedIT taxonomy dictionary and roles. The servers returns files with the necessary data structures, graphs and metadata to utilize the data in other systems easily. You can find a web based version at casrai.org/credit - simply input the below text or any description of your research work's contributions.

Research Summary:

Dr. Elena M. Torres: As the lead researcher, Elena coordinated the entire project. She was the mastermind behind the research idea, drawing on her extensive knowledge in astrophysics to guide the team and the study's direction.

Sir Charles J. Brighton: Charles, with his deep expertise in theoretical physics, developed the complex mathematical models that formed the backbone of the research, helping the team understand the intricate details of gravitational lensing.

Dr. Aisha K. Rahman: Aisha's role was crucial in gathering the telescope data. Her keen eye for detail ensured that the team had the best possible observational data to work with.

Prof. Rajeev Gupta: Rajeev, the data guru, was all about numbers. He analyzed the vast amounts of data, making sense of the patterns and turning them into understandable insights about dark matter.

Dr. Fiona McAlpine: Fiona was the team's go-to expert for all things related to the telescopic instruments. Her technical know-how ensured that the equipment was always in top shape for capturing the best data.

Dr. Hector S. Wallace: Hector dove deep into the data, spending hours analyzing and interpreting the findings. His contributions were key to understanding the results of the study.

Maria Z. Li: As a doctoral student, Maria was involved in many aspects of the project, from data collection to drafting sections of the research paper, bringing a fresh perspective to the team.

Jonathan P. O'Neill: Jonathan had the crucial task of making the research accessible. He refined the manuscript, ensuring that the complex science was clearly and accurately conveyed.

Dr. Lucas DeSouza: Lucas played a vital role in sharing the research with the world. He managed the outreach, effectively communicating the study's findings to the broader scientific community and the public.

Emily Sato: Emily kept the team's technology running smoothly. Whether it was a software glitch or hardware hiccup, she was there to make sure the team had the tech support they needed.


