# CASRAI.org Credit Taxonomy Project API Examples

## Introduction
This repository contains examples of how to make POST requests to the CASRAI Credit Taxonomy Project's specified endpoint using different programming languages. The purpose is to provide a clear and easy way for researchers and developers to integrate with our API, enhancing research contribution documentation.

## How to Use
Each directory contains complete code samples for a specific programming language: Curl, Python, PHP, and Java. Follow the instructions in each file to run the examples.

### 1. Curl (Command Line)
```bash
curl -X POST -H "Content-Type: application/json" -d '{"text":"Your text here"}' https://tools.casrai.org/generate-metadata

### Example Research Summary    

Below you find a prompt for a research paper, where each team member send their contributions in natural language. Using the endpoint tools.casrai.org, you will get a response from our Llama 2 AI model traned in CRedIT taxonomy dictionary and roles. The servers returns files with the necessary data structures, graphs and metadata to utilize the data in other systems easily. You can find a web based version at casrai.org/credit - simply input the below text or any description of your research work's contributions.

### Sample Prompt

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

### Actual Response to Above User Text

## PDF Graph

![Alt text for CredIT PDF](CredIT-PDF.png)



## CredIT Taxonomy Metadata

<?xml version="1.0" encoding="UTF-8"?>
<article xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:mml="http://www.w3.org/1998/Math/MathML">
  <contrib-group>
    <contrib contrib-type="author">
      <string-name>
        <surname>Torres</surname>
        <given-names>Elena M.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Conceptualization" vocab-term-identifier="https://casrai.org/contributor-roles/conceptualization/">Conceptualization</role>
      <role-description>As the lead researcher, Elena coordinated the entire project. She was the mastermind behind the research idea, guiding the team and the study&apos;s direction.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Project administration" vocab-term-identifier="https://casrai.org/contributor-roles/project-administration/">Project administration</role>
      <role-description>As the lead researcher, Elena coordinated the entire project. She was the mastermind behind the research idea, guiding the team and the study&apos;s direction.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Supervision" vocab-term-identifier="https://casrai.org/contributor-roles/supervision/">Supervision</role>
      <role-description>As the lead researcher, Elena coordinated the entire project. She was the mastermind behind the research idea, guiding the team and the study&apos;s direction.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Brighton</surname>
        <given-names>Charles J.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Formal analysis" vocab-term-identifier="https://casrai.org/contributor-roles/formal-analysis/">Formal analysis</role>
      <role-description>Charles, with his expertise in theoretical physics, developed the complex mathematical models that formed the backbone of the research.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Methodology" vocab-term-identifier="https://casrai.org/contributor-roles/methodology/">Methodology</role>
      <role-description>Charles, with his expertise in theoretical physics, developed the complex mathematical models that formed the backbone of the research.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Rahman</surname>
        <given-names>Aisha K.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Data curation" vocab-term-identifier="https://casrai.org/contributor-roles/data-curation/">Data curation</role>
      <role-description>Aisha&apos;s role was crucial in gathering the telescope data, ensuring that the team had the best possible observational data.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Investigation" vocab-term-identifier="https://casrai.org/contributor-roles/investigation/">Investigation</role>
      <role-description>Aisha&apos;s role was crucial in gathering the telescope data, ensuring that the team had the best possible observational data.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Gupta</surname>
        <given-names>Rajeev</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Data curation" vocab-term-identifier="https://casrai.org/contributor-roles/data-curation/">Data curation</role>
      <role-description>Rajeev analyzed the vast amounts of data, turning them into understandable insights about dark matter.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Formal analysis" vocab-term-identifier="https://casrai.org/contributor-roles/formal-analysis/">Formal analysis</role>
      <role-description>Rajeev analyzed the vast amounts of data, turning them into understandable insights about dark matter.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>McAlpine</surname>
        <given-names>Fiona</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Equipment or material support" vocab-term-identifier="https://casrai.org/contributor-roles/equipment-or-material-support/">Equipment or material support</role>
      <role-description>Fiona ensured that the telescopic instruments were always in top shape for capturing the best data.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Investigation" vocab-term-identifier="https://casrai.org/contributor-roles/investigation/">Investigation</role>
      <role-description>Fiona ensured that the telescopic instruments were always in top shape for capturing the best data.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Wallace</surname>
        <given-names>Hector S.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Analysis" vocab-term-identifier="https://casrai.org/contributor-roles/analysis/">Analysis</role>
      <role-description>Hector spent hours analyzing and interpreting the findings, key to understanding the results of the study.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Investigation" vocab-term-identifier="https://casrai.org/contributor-roles/investigation/">Investigation</role>
      <role-description>Hector spent hours analyzing and interpreting the findings, key to understanding the results of the study.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Li</surname>
        <given-names>Maria Z.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Data curation" vocab-term-identifier="https://casrai.org/contributor-roles/data-curation/">Data curation</role>
      <role-description>Maria was involved in many aspects of the project, from data collection to drafting sections of the research paper.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Writing – original draft" vocab-term-identifier="https://casrai.org/contributor-roles/writing-–-original-draft/">Writing – original draft</role>
      <role-description>Maria was involved in many aspects of the project, from data collection to drafting sections of the research paper.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>O&apos;Neill</surname>
        <given-names>Jonathan P.</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Writing – review &amp; editing" vocab-term-identifier="https://casrai.org/contributor-roles/writing-–-review-&amp;-editing/">Writing – review &amp; editing</role>
      <role-description>Jonathan refined the manuscript, ensuring that the complex science was clearly and accurately conveyed.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>DeSouza</surname>
        <given-names>Lucas</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Dissemination" vocab-term-identifier="https://casrai.org/contributor-roles/dissemination/">Dissemination</role>
      <role-description>Lucas played a vital role in sharing the research with the world, communicating the study&apos;s findings.</role-description>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Outreach" vocab-term-identifier="https://casrai.org/contributor-roles/outreach/">Outreach</role>
      <role-description>Lucas played a vital role in sharing the research with the world, communicating the study&apos;s findings.</role-description>
    </contrib>
    <contrib contrib-type="author">
      <string-name>
        <surname>Sato</surname>
        <given-names>Emily</given-names>
      </string-name>
      <role vocab="credit" vocab-identifier="https://casrai.org/" vocab-term="Support – technical (software and hardware)" vocab-term-identifier="https://casrai.org/contributor-roles/support-–-technical-(software-and-hardware)/">Support – technical (software and hardware)</role>
      <role-description>Emily kept the team&apos;s technology running smoothly, addressing both software glitches and hardware hiccups.</role-description>
    </contrib>
  </contrib-group>
</article>


## LateX Codd (Raw)


        \documentclass[tikz]{standalone}
        \usepackage{tikz}
        \usetikzlibrary{matrix}
        \begin{document}
        \begin{tikzpicture}
  \tikzset{rolestyle/.style={draw, minimum size=5mm, fill=black, anchor=center}}
  % Define the matrix with empty cells
  \matrix (contribmatrix) [matrix of nodes, nodes in empty cells, column sep=2mm, row sep=2mm] {
  & \textbf{Torres Elena M.} & \textbf{Brighton Charles J.} & \textbf{Rahman Aisha K.} & \textbf{Gupta Rajeev} & \textbf{McAlpine Fiona} & \textbf{Wallace Hector S.} & \textbf{Li Maria Z.} & \textbf{O'Neill Jonathan P.} & \textbf{DeSouza Lucas} & \textbf{Sato Emily} \\
  \textbf{Conceptualization} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Data curation} &  &  & |[rolestyle]| & |[rolestyle]| &  &  & |[rolestyle]| &  &  &  \\
  \textbf{Formal analysis} &  & |[rolestyle]| &  & |[rolestyle]| &  &  &  &  &  &  \\
  \textbf{Funding acquisition} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Investigation} &  &  & |[rolestyle]| &  & |[rolestyle]| & |[rolestyle]| &  &  &  &  \\
  \textbf{Methodology} &  & |[rolestyle]| &  &  &  &  &  &  &  &  \\
  \textbf{Project administration} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Resources} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Software} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Supervision} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Validation} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Visualization} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Writing \texttt{--} original draft} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Writing \texttt{--} review \& editing} &  &  &  &  &  &  &  &  &  &  \\
};
\end{tikzpicture} 
        \end{document}
        

## Tikz Code (Raw Graph)

\begin{tikzpicture}
  \tikzset{rolestyle/.style={draw, minimum size=5mm, fill=black, anchor=center}}
  % Define the matrix with empty cells
  \matrix (contribmatrix) [matrix of nodes, nodes in empty cells, column sep=2mm, row sep=2mm] {
  & \textbf{Torres Elena M.} & \textbf{Brighton Charles J.} & \textbf{Rahman Aisha K.} & \textbf{Gupta Rajeev} & \textbf{McAlpine Fiona} & \textbf{Wallace Hector S.} & \textbf{Li Maria Z.} & \textbf{O'Neill Jonathan P.} & \textbf{DeSouza Lucas} & \textbf{Sato Emily} \\
  \textbf{Conceptualization} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Data curation} &  &  & |[rolestyle]| & |[rolestyle]| &  &  & |[rolestyle]| &  &  &  \\
  \textbf{Formal analysis} &  & |[rolestyle]| &  & |[rolestyle]| &  &  &  &  &  &  \\
  \textbf{Funding acquisition} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Investigation} &  &  & |[rolestyle]| &  & |[rolestyle]| & |[rolestyle]| &  &  &  &  \\
  \textbf{Methodology} &  & |[rolestyle]| &  &  &  &  &  &  &  &  \\
  \textbf{Project administration} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Resources} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Software} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Supervision} & |[rolestyle]| &  &  &  &  &  &  &  &  &  \\
  \textbf{Validation} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Visualization} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Writing \texttt{--} original draft} &  &  &  &  &  &  &  &  &  &  \\
  \textbf{Writing \texttt{--} review \& editing} &  &  &  &  &  &  &  &  &  &  \\
};
\end{tikzpicture} 

