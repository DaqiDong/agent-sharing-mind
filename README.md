# An autonomous agent sharing its mind, describing its conscious contents
## Abstract
I enable an autonomous agent sharing its artificial mind to its audiences like humans. This supports the autonomous human robot interactions relying on a cognitive architecture, LIDA, which explains and predicts how minds work and is used as the controllers of intelligent autonomous agents.

I built a LIDA software agent embedding with a new description (sub) model, which enables the agent describing its conscious contents. Through this description, the agent’s mind is more observable so we can understand the agent’s entity, behaviors and intelligence directly. 

**Full paper:** https://doi.org/10.1609/aaaiss.v2i1.27666

## Usage

**Start to run:** `socialAgent/src/myagent/Run.java`

**Main config:** `socialAgent/config/lidaConfig.properties`

## LIDA and its architecture
The LIDA model (Learning Intelligent Decision Agent) (Franklin et al., 2016) hypothesizes and predicts how minds work. It provides an architecture integrating multiple cog-nitive modules, and each of which has different cognitive representations and processes.

It has integrated three phases: perception and understanding, attention, and action and learning (Fig. 1). These phases are functioning continually in a cognitive cycle (~10 Hz) and may (partially) overlap among multiple cycles.

![LIDA Archtecture](assets/LIDA_fig_reproduced_v1.jpg)

Figure 1: LIDA Cognitive Cycle Diagram  (Franklin et al., 2016)

## Experiment
I implemented the new description model into the LIDA agent, which senses an object of water from the external environment and has both a thirsty and description nodes built-in internally. The agent attends on some of these as its conscious content, and chooses to execute certain actions to meet its agenda, such as grasp, speak, or draw (Fig. 2).

![Framework_GUI](assets/Exp.jpg)

Figure 2: The snapshots of the LIDA agent’s inner modules: (a) Percepts of the Current Situational Model, (b) Attention coalitions in Global Workspace, and (c) Schemes in Procedural Memory 


