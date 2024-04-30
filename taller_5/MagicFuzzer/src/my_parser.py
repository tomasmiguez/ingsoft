from html.parser import HTMLParser


def my_parser(inp: str) -> None:
    parser = HTMLParser()  # resets the HTMLParser object for every fuzz input
    parser.feed(inp)
