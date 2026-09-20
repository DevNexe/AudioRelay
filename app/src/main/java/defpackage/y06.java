package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y06 extends n16 {
    public final /* synthetic */ int b;

    public y06(int i) {
        this.b = i;
        if (i == 1) {
            ArrayList arrayList = this.a;
            arrayList.add(u46.APPLY);
            arrayList.add(u46.BLOCK);
            arrayList.add(u46.BREAK);
            arrayList.add(u46.CASE);
            arrayList.add(u46.DEFAULT);
            arrayList.add(u46.CONTINUE);
            arrayList.add(u46.DEFINE_FUNCTION);
            arrayList.add(u46.FN);
            arrayList.add(u46.IF);
            arrayList.add(u46.QUOTE);
            arrayList.add(u46.RETURN);
            arrayList.add(u46.SWITCH);
            arrayList.add(u46.TERNARY);
            return;
        }
        if (i != 2) {
            ArrayList arrayList2 = this.a;
            arrayList2.add(u46.BITWISE_AND);
            arrayList2.add(u46.BITWISE_LEFT_SHIFT);
            arrayList2.add(u46.BITWISE_NOT);
            arrayList2.add(u46.BITWISE_OR);
            arrayList2.add(u46.BITWISE_RIGHT_SHIFT);
            arrayList2.add(u46.BITWISE_UNSIGNED_RIGHT_SHIFT);
            arrayList2.add(u46.BITWISE_XOR);
            return;
        }
        ArrayList arrayList3 = this.a;
        arrayList3.add(u46.ADD);
        arrayList3.add(u46.DIVIDE);
        arrayList3.add(u46.MODULUS);
        arrayList3.add(u46.MULTIPLY);
        arrayList3.add(u46.NEGATE);
        arrayList3.add(u46.POST_DECREMENT);
        arrayList3.add(u46.POST_INCREMENT);
        arrayList3.add(u46.PRE_DECREMENT);
        arrayList3.add(u46.PRE_INCREMENT);
        arrayList3.add(u46.SUBTRACT);
    }

    public static az5 c(ma5 ma5Var, ArrayList arrayList) {
        u46 u46Var = u46.ADD;
        nw6.i("FN", 2, arrayList);
        ez5 ez5VarB = ma5Var.b((ez5) arrayList.get(0));
        ez5 ez5VarB2 = ma5Var.b((ez5) arrayList.get(1));
        if (!(ez5VarB2 instanceof hu5)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", ez5VarB2.getClass().getCanonicalName()));
        }
        ArrayList arrayListH = ((hu5) ez5VarB2).h();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new az5(ez5VarB.zzi(), arrayListH, arrayList2, ma5Var);
    }

    @Override // defpackage.n16
    public final ez5 a(String str, ma5 ma5Var, ArrayList arrayList) {
        ez5 f06Var;
        gw5 gw5Var;
        switch (this.b) {
            case 0:
                u46 u46Var = u46.ADD;
                switch (nw6.e(str).ordinal()) {
                    case 4:
                        nw6.h("BITWISE_AND", 2, arrayList);
                        return new gw5(Double.valueOf(nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) & nw6.b(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue())));
                    case 5:
                        nw6.h("BITWISE_LEFT_SHIFT", 2, arrayList);
                        gw5Var = new gw5(Double.valueOf(nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) << ((int) (nw6.d(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()) & 31))));
                        break;
                    case 6:
                        nw6.h("BITWISE_NOT", 1, arrayList);
                        return new gw5(Double.valueOf(~nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue())));
                    case 7:
                        nw6.h("BITWISE_OR", 2, arrayList);
                        return new gw5(Double.valueOf(nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) | nw6.b(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue())));
                    case 8:
                        nw6.h("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        gw5Var = new gw5(Double.valueOf(nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) >> ((int) (nw6.d(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()) & 31))));
                        break;
                    case 9:
                        nw6.h("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new gw5(Double.valueOf(nw6.d(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) >>> ((int) (nw6.d(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()) & 31))));
                    case 10:
                        nw6.h("BITWISE_XOR", 2, arrayList);
                        return new gw5(Double.valueOf(nw6.b(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()) ^ nw6.b(ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
                return gw5Var;
            case 1:
                u46 u46Var2 = u46.ADD;
                int iOrdinal = nw6.e(str).ordinal();
                if (iOrdinal == 2) {
                    nw6.h("APPLY", 3, arrayList);
                    ez5 ez5VarB = ma5Var.b((ez5) arrayList.get(0));
                    String strZzi = ma5Var.b((ez5) arrayList.get(1)).zzi();
                    ez5 ez5VarB2 = ma5Var.b((ez5) arrayList.get(2));
                    if (!(ez5VarB2 instanceof hu5)) {
                        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", ez5VarB2.getClass().getCanonicalName()));
                    }
                    if (strZzi.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return ez5VarB.c(strZzi, ma5Var, ((hu5) ez5VarB2).h());
                }
                if (iOrdinal == 15) {
                    nw6.h("BREAK", 0, arrayList);
                    return ez5.q;
                }
                if (iOrdinal == 25) {
                    return c(ma5Var, arrayList);
                }
                if (iOrdinal == 41) {
                    nw6.i("IF", 2, arrayList);
                    ez5 ez5VarB3 = ma5Var.b((ez5) arrayList.get(0));
                    ez5 ez5VarB4 = ma5Var.b((ez5) arrayList.get(1));
                    ez5 ez5VarB5 = arrayList.size() > 2 ? ma5Var.b((ez5) arrayList.get(2)) : null;
                    ez5 ez5Var = ez5.o;
                    ez5 ez5VarC = ez5VarB3.zzg().booleanValue() ? ma5Var.c((hu5) ez5VarB4) : ez5VarB5 != null ? ma5Var.c((hu5) ez5VarB5) : ez5Var;
                    return ez5VarC instanceof uv5 ? ez5VarC : ez5Var;
                }
                if (iOrdinal == 54) {
                    return new hu5(arrayList);
                }
                if (iOrdinal == 57) {
                    if (arrayList.isEmpty()) {
                        return ez5.s;
                    }
                    nw6.h("RETURN", 1, arrayList);
                    return new uv5("return", ma5Var.b((ez5) arrayList.get(0)));
                }
                if (iOrdinal != 19) {
                    if (iOrdinal == 20) {
                        nw6.i("DEFINE_FUNCTION", 2, arrayList);
                        az5 az5VarC = c(ma5Var, arrayList);
                        String str2 = az5VarC.w;
                        if (str2 == null) {
                            ma5Var.h("", az5VarC);
                            return az5VarC;
                        }
                        ma5Var.h(str2, az5VarC);
                        return az5VarC;
                    }
                    if (iOrdinal == 60) {
                        nw6.h("SWITCH", 3, arrayList);
                        ez5 ez5VarB6 = ma5Var.b((ez5) arrayList.get(0));
                        ez5 ez5VarB7 = ma5Var.b((ez5) arrayList.get(1));
                        ez5 ez5VarB8 = ma5Var.b((ez5) arrayList.get(2));
                        if (!(ez5VarB7 instanceof hu5)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(ez5VarB8 instanceof hu5)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        hu5 hu5Var = (hu5) ez5VarB7;
                        hu5 hu5Var2 = (hu5) ez5VarB8;
                        boolean z = false;
                        for (int i = 0; i < hu5Var.d(); i++) {
                            if (z || ez5VarB6.equals(ma5Var.b(hu5Var.e(i)))) {
                                ez5 ez5VarB9 = ma5Var.b(hu5Var2.e(i));
                                if (ez5VarB9 instanceof uv5) {
                                    return ((uv5) ez5VarB9).x.equals("break") ? ez5.o : ez5VarB9;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (hu5Var.d() + 1 == hu5Var2.d()) {
                            ez5 ez5VarB10 = ma5Var.b(hu5Var2.e(hu5Var.d()));
                            if (ez5VarB10 instanceof uv5) {
                                String str3 = ((uv5) ez5VarB10).x;
                                if (str3.equals("return") || str3.equals("continue")) {
                                    return ez5VarB10;
                                }
                            }
                        }
                        return ez5.o;
                    }
                    if (iOrdinal == 61) {
                        nw6.h("TERNARY", 3, arrayList);
                        return ma5Var.b((ez5) arrayList.get(0)).zzg().booleanValue() ? ma5Var.b((ez5) arrayList.get(1)) : ma5Var.b((ez5) arrayList.get(2));
                    }
                    switch (iOrdinal) {
                        case 11:
                            return ma5Var.a().c(new hu5(arrayList));
                        case 12:
                            nw6.h("BREAK", 0, arrayList);
                            return ez5.r;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return ez5.o;
                }
                ez5 ez5VarB11 = ma5Var.b((ez5) arrayList.get(0));
                return ez5VarB11 instanceof hu5 ? ma5Var.c((hu5) ez5VarB11) : ez5.o;
            default:
                u46 u46Var3 = u46.ADD;
                int iOrdinal2 = nw6.e(str).ordinal();
                if (iOrdinal2 == 0) {
                    nw6.h("ADD", 2, arrayList);
                    ez5 ez5VarB12 = ma5Var.b((ez5) arrayList.get(0));
                    ez5 ez5VarB13 = ma5Var.b((ez5) arrayList.get(1));
                    f06Var = ((ez5VarB12 instanceof by5) || (ez5VarB12 instanceof f06) || (ez5VarB13 instanceof by5) || (ez5VarB13 instanceof f06)) ? new f06(String.valueOf(ez5VarB12.zzi()).concat(String.valueOf(ez5VarB13.zzi()))) : new gw5(Double.valueOf(ez5VarB13.zzh().doubleValue() + ez5VarB12.zzh().doubleValue()));
                } else if (iOrdinal2 == 21) {
                    nw6.h("DIVIDE", 2, arrayList);
                    f06Var = new gw5(Double.valueOf(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue() / ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()));
                } else if (iOrdinal2 == 59) {
                    nw6.h("SUBTRACT", 2, arrayList);
                    ez5 ez5VarB14 = ma5Var.b((ez5) arrayList.get(0));
                    Double dValueOf = Double.valueOf(-ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue());
                    if (dValueOf == null) {
                        dValueOf = Double.valueOf(Double.NaN);
                    }
                    f06Var = new gw5(Double.valueOf(dValueOf.doubleValue() + ez5VarB14.zzh().doubleValue()));
                } else {
                    if (iOrdinal2 == 52 || iOrdinal2 == 53) {
                        nw6.h(str, 2, arrayList);
                        ez5 ez5VarB15 = ma5Var.b((ez5) arrayList.get(0));
                        ma5Var.b((ez5) arrayList.get(1));
                        return ez5VarB15;
                    }
                    if (iOrdinal2 == 55 || iOrdinal2 == 56) {
                        nw6.h(str, 1, arrayList);
                        return ma5Var.b((ez5) arrayList.get(0));
                    }
                    switch (iOrdinal2) {
                        case 44:
                            nw6.h("MODULUS", 2, arrayList);
                            f06Var = new gw5(Double.valueOf(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue() % ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()));
                            break;
                        case 45:
                            nw6.h("MULTIPLY", 2, arrayList);
                            f06Var = new gw5(Double.valueOf(ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue() * ma5Var.b((ez5) arrayList.get(1)).zzh().doubleValue()));
                            break;
                        case 46:
                            nw6.h("NEGATE", 1, arrayList);
                            return new gw5(Double.valueOf(-ma5Var.b((ez5) arrayList.get(0)).zzh().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return f06Var;
        }
    }
}
