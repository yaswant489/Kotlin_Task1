package com.example.ai37c.assignment

fun main() {
    val wordsMeanings = mapOf(
        "cause" to "the reason why something, especially something bad, happens",
        "assignment" to "a task or piece of work allocated to someone as part of a job or course of study.",
        "issue" to "an important topic or problem for debate or discussion.",
        "problem" to "a matter or situation regarded as unwelcome or harmful and needing to be dealt with and overcome.",
        "male" to "of or denoting the sex that produces gametes, especially spermatozoa, with which a female may be fertilized or inseminated to produce offspring.",
    )
    println("Enter a word to find its meaning: ")
    val input: String = readln().lowercase()
    println(wordsMeanings[input])
}