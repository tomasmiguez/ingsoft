import inspect


def get_source_lines(f) -> int:
    return len(inspect.getsourcelines(f)[0])