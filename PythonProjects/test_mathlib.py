import mathlib

def test_calc_add():
    total=mathlib.calc_add(4,5)
    assert total==9

def test_calc_mul():
    reslt=mathlib.calc_mul(5,10)
    assert reslt==50