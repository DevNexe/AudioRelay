package defpackage;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k26 extends n16 {
    public final /* synthetic */ int b;

    public k26(int i) {
        this.b = i;
        if (i == 1) {
            ArrayList arrayList = this.a;
            arrayList.add(u46.FOR_IN);
            arrayList.add(u46.FOR_IN_CONST);
            arrayList.add(u46.FOR_IN_LET);
            arrayList.add(u46.FOR_LET);
            arrayList.add(u46.FOR_OF);
            arrayList.add(u46.FOR_OF_CONST);
            arrayList.add(u46.FOR_OF_LET);
            arrayList.add(u46.WHILE);
            return;
        }
        if (i != 2) {
            ArrayList arrayList2 = this.a;
            arrayList2.add(u46.EQUALS);
            arrayList2.add(u46.GREATER_THAN);
            arrayList2.add(u46.GREATER_THAN_EQUALS);
            arrayList2.add(u46.IDENTITY_EQUALS);
            arrayList2.add(u46.IDENTITY_NOT_EQUALS);
            arrayList2.add(u46.LESS_THAN);
            arrayList2.add(u46.LESS_THAN_EQUALS);
            arrayList2.add(u46.NOT_EQUALS);
            return;
        }
        ArrayList arrayList3 = this.a;
        arrayList3.add(u46.ASSIGN);
        arrayList3.add(u46.CONST);
        arrayList3.add(u46.CREATE_ARRAY);
        arrayList3.add(u46.CREATE_OBJECT);
        arrayList3.add(u46.EXPRESSION_LIST);
        arrayList3.add(u46.GET);
        arrayList3.add(u46.GET_INDEX);
        arrayList3.add(u46.GET_PROPERTY);
        arrayList3.add(u46.NULL);
        arrayList3.add(u46.SET_PROPERTY);
        arrayList3.add(u46.TYPEOF);
        arrayList3.add(u46.UNDEFINED);
        arrayList3.add(u46.VAR);
    }

    public static ez5 c(a46 a46Var, Iterator it, ez5 ez5Var) {
        if (it != null) {
            while (it.hasNext()) {
                ez5 ez5VarC = a46Var.a((ez5) it.next()).c((hu5) ez5Var);
                if (ez5VarC instanceof uv5) {
                    uv5 uv5Var = (uv5) ez5VarC;
                    if ("break".equals(uv5Var.x)) {
                        return ez5.o;
                    }
                    if ("return".equals(uv5Var.x)) {
                        return uv5Var;
                    }
                }
            }
        }
        return ez5.o;
    }

    public static boolean d(ez5 ez5Var, ez5 ez5Var2) {
        if (ez5Var.getClass().equals(ez5Var2.getClass())) {
            if ((ez5Var instanceof n06) || (ez5Var instanceof oy5)) {
                return true;
            }
            if (ez5Var instanceof gw5) {
                return (Double.isNaN(ez5Var.zzh().doubleValue()) || Double.isNaN(ez5Var2.zzh().doubleValue()) || ez5Var.zzh().doubleValue() != ez5Var2.zzh().doubleValue()) ? false : true;
            }
            if (ez5Var instanceof f06) {
                return ez5Var.zzi().equals(ez5Var2.zzi());
            }
            if (ez5Var instanceof av5) {
                return ez5Var.zzg().equals(ez5Var2.zzg());
            }
            return ez5Var == ez5Var2;
        }
        if (((ez5Var instanceof n06) || (ez5Var instanceof oy5)) && ((ez5Var2 instanceof n06) || (ez5Var2 instanceof oy5))) {
            return true;
        }
        boolean z = ez5Var instanceof gw5;
        if (z && (ez5Var2 instanceof f06)) {
            return d(ez5Var, new gw5(ez5Var2.zzh()));
        }
        boolean z2 = ez5Var instanceof f06;
        if (z2 && (ez5Var2 instanceof gw5)) {
            return d(new gw5(ez5Var.zzh()), ez5Var2);
        }
        if (ez5Var instanceof av5) {
            return d(new gw5(ez5Var.zzh()), ez5Var2);
        }
        if (ez5Var2 instanceof av5) {
            return d(ez5Var, new gw5(ez5Var2.zzh()));
        }
        if ((z2 || z) && (ez5Var2 instanceof by5)) {
            return d(ez5Var, new f06(ez5Var2.zzi()));
        }
        if ((ez5Var instanceof by5) && ((ez5Var2 instanceof f06) || (ez5Var2 instanceof gw5))) {
            return d(new f06(ez5Var.zzi()), ez5Var2);
        }
        return false;
    }

    public static boolean e(ez5 ez5Var, ez5 ez5Var2) {
        if (ez5Var instanceof by5) {
            ez5Var = new f06(ez5Var.zzi());
        }
        if (ez5Var2 instanceof by5) {
            ez5Var2 = new f06(ez5Var2.zzi());
        }
        if ((ez5Var instanceof f06) && (ez5Var2 instanceof f06)) {
            return ez5Var.zzi().compareTo(ez5Var2.zzi()) < 0;
        }
        double dDoubleValue = ez5Var.zzh().doubleValue();
        double dDoubleValue2 = ez5Var2.zzh().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static ez5 f(a46 a46Var, ez5 ez5Var, ez5 ez5Var2) {
        if (ez5Var instanceof Iterable) {
            return c(a46Var, ((Iterable) ez5Var).iterator(), ez5Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean g(ez5 ez5Var, ez5 ez5Var2) {
        if (ez5Var instanceof by5) {
            ez5Var = new f06(ez5Var.zzi());
        }
        if (ez5Var2 instanceof by5) {
            ez5Var2 = new f06(ez5Var2.zzi());
        }
        return (((ez5Var instanceof f06) && (ez5Var2 instanceof f06)) || !(Double.isNaN(ez5Var.zzh().doubleValue()) || Double.isNaN(ez5Var2.zzh().doubleValue()))) && !e(ez5Var2, ez5Var);
    }

    /* JADX WARN: Code duplicated, block: B:271:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [ez5] */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v40, types: [hu5] */
    /* JADX WARN: Type inference failed for: r2v45, types: [hy5] */
    @Override // defpackage.n16
    public final ez5 a(String str, ma5 ma5Var, ArrayList arrayList) {
        ez5 ez5VarB;
        ?? hu5Var;
        String str2;
        boolean zD;
        boolean zD2;
        ez5 ez5VarC;
        uv5 uv5Var;
        int i = 0;
        switch (this.b) {
            case 0:
                nw6.h(nw6.e(str).name(), 2, arrayList);
                ez5 ez5VarB2 = ma5Var.b((ez5) arrayList.get(0));
                ez5 ez5VarB3 = ma5Var.b((ez5) arrayList.get(1));
                int iOrdinal = nw6.e(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zD2 = d(ez5VarB2, ez5VarB3);
                    } else if (iOrdinal == 42) {
                        zD = e(ez5VarB2, ez5VarB3);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zD = e(ez5VarB3, ez5VarB2);
                                break;
                            case 38:
                                zD = g(ez5VarB3, ez5VarB2);
                                break;
                            case 39:
                                zD = nw6.l(ez5VarB2, ez5VarB3);
                                break;
                            case 40:
                                zD2 = nw6.l(ez5VarB2, ez5VarB3);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zD = g(ez5VarB2, ez5VarB3);
                    }
                    zD = !zD2;
                } else {
                    zD = d(ez5VarB2, ez5VarB3);
                }
                return zD ? ez5.t : ez5.u;
            case 1:
                u46 u46Var = u46.ADD;
                int iOrdinal2 = nw6.e(str).ordinal();
                if (iOrdinal2 == 65) {
                    nw6.h("WHILE", 4, arrayList);
                    ez5 ez5Var = (ez5) arrayList.get(0);
                    ez5 ez5Var2 = (ez5) arrayList.get(1);
                    ez5 ez5Var3 = (ez5) arrayList.get(2);
                    ez5 ez5VarB4 = ma5Var.b((ez5) arrayList.get(3));
                    if (!ma5Var.b(ez5Var3).zzg().booleanValue()) {
                        while (ma5Var.b(ez5Var).zzg().booleanValue()) {
                            ez5VarC = ma5Var.c((hu5) ez5VarB4);
                            if (ez5VarC instanceof uv5) {
                                uv5Var = (uv5) ez5VarC;
                                if ("break".equals(uv5Var.x)) {
                                    return ez5.o;
                                }
                                if ("return".equals(uv5Var.x)) {
                                }
                            }
                            ma5Var.b(ez5Var2);
                        }
                        return ez5.o;
                    }
                    ez5 ez5VarC2 = ma5Var.c((hu5) ez5VarB4);
                    if (!(ez5VarC2 instanceof uv5)) {
                        while (ma5Var.b(ez5Var).zzg().booleanValue()) {
                            ez5VarC = ma5Var.c((hu5) ez5VarB4);
                            if (ez5VarC instanceof uv5) {
                                uv5Var = (uv5) ez5VarC;
                                if ("break".equals(uv5Var.x)) {
                                    return ez5.o;
                                }
                                if ("return".equals(uv5Var.x)) {
                                }
                            }
                            ma5Var.b(ez5Var2);
                        }
                        return ez5.o;
                    }
                    uv5Var = (uv5) ez5VarC2;
                    if ("break".equals(uv5Var.x)) {
                        return ez5.o;
                    }
                    if (!"return".equals(uv5Var.x)) {
                        while (ma5Var.b(ez5Var).zzg().booleanValue()) {
                            ez5VarC = ma5Var.c((hu5) ez5VarB4);
                            if (ez5VarC instanceof uv5) {
                                uv5Var = (uv5) ez5VarC;
                                if ("break".equals(uv5Var.x)) {
                                    return ez5.o;
                                }
                                if ("return".equals(uv5Var.x)) {
                                }
                            }
                            ma5Var.b(ez5Var2);
                        }
                        return ez5.o;
                    }
                    return uv5Var;
                }
                switch (iOrdinal2) {
                    case 26:
                        nw6.h("FOR_IN", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return c(new d7G(18, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)).zzl(), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    case 27:
                        nw6.h("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return c(new ss3(17, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)).zzl(), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    case 28:
                        nw6.h("FOR_IN_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return c(new cq4(23, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)).zzl(), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    case 29:
                        nw6.h("FOR_LET", 4, arrayList);
                        ez5 ez5VarB5 = ma5Var.b((ez5) arrayList.get(0));
                        if (!(ez5VarB5 instanceof hu5)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        hu5 hu5Var2 = (hu5) ez5VarB5;
                        ez5 ez5Var4 = (ez5) arrayList.get(1);
                        ez5 ez5Var5 = (ez5) arrayList.get(2);
                        ez5 ez5VarB6 = ma5Var.b((ez5) arrayList.get(3));
                        ma5 ma5VarA = ma5Var.a();
                        for (int i2 = 0; i2 < hu5Var2.d(); i2++) {
                            String strZzi = hu5Var2.e(i2).zzi();
                            ma5VarA.h(strZzi, ma5Var.d(strZzi));
                        }
                        while (ma5Var.b(ez5Var4).zzg().booleanValue()) {
                            ez5 ez5VarC3 = ma5Var.c((hu5) ez5VarB6);
                            if (ez5VarC3 instanceof uv5) {
                                uv5 uv5Var2 = (uv5) ez5VarC3;
                                if ("break".equals(uv5Var2.x)) {
                                    return ez5.o;
                                }
                                if ("return".equals(uv5Var2.x)) {
                                    return uv5Var2;
                                }
                            }
                            ma5 ma5VarA2 = ma5Var.a();
                            for (int i3 = 0; i3 < hu5Var2.d(); i3++) {
                                String strZzi2 = hu5Var2.e(i3).zzi();
                                ma5VarA2.h(strZzi2, ma5VarA.d(strZzi2));
                            }
                            ma5VarA2.b(ez5Var5);
                            ma5VarA = ma5VarA2;
                        }
                        return ez5.o;
                    case 30:
                        nw6.h("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return f(new d7G(18, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    case 31:
                        nw6.h("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return f(new ss3(17, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    case 32:
                        nw6.h("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof f06) {
                            return f(new cq4(23, ma5Var, ((ez5) arrayList.get(0)).zzi()), ma5Var.b((ez5) arrayList.get(1)), ma5Var.b((ez5) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    default:
                        b(str);
                        throw null;
                }
            default:
                u46 u46Var2 = u46.ADD;
                int iOrdinal3 = nw6.e(str).ordinal();
                if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 14) {
                        nw6.i("CONST", 2, arrayList);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                        }
                        for (int i4 = 0; i4 < arrayList.size() - 1; i4 += 2) {
                            ez5 ez5VarB7 = ma5Var.b((ez5) arrayList.get(i4));
                            if (!(ez5VarB7 instanceof f06)) {
                                throw new IllegalArgumentException(String.format("Expected string for const name. got %s", ez5VarB7.getClass().getCanonicalName()));
                            }
                            String strZzi3 = ez5VarB7.zzi();
                            ma5Var.f(strZzi3, ma5Var.b((ez5) arrayList.get(i4 + 1)));
                            ((Map) ma5Var.z).put(strZzi3, Boolean.TRUE);
                        }
                        return ez5.o;
                    }
                    if (iOrdinal3 == 24) {
                        nw6.i("EXPRESSION_LIST", 1, arrayList);
                        hu5Var = ez5.o;
                        while (i < arrayList.size()) {
                            ez5 ez5VarB8 = ma5Var.b((ez5) arrayList.get(i));
                            if (ez5VarB8 instanceof uv5) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i++;
                            hu5Var = ez5VarB8;
                        }
                    } else {
                        if (iOrdinal3 == 33) {
                            nw6.h("GET", 1, arrayList);
                            ez5 ez5VarB9 = ma5Var.b((ez5) arrayList.get(0));
                            if (ez5VarB9 instanceof f06) {
                                return ma5Var.d(ez5VarB9.zzi());
                            }
                            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", ez5VarB9.getClass().getCanonicalName()));
                        }
                        if (iOrdinal3 == 49) {
                            nw6.h("NULL", 0, arrayList);
                            return ez5.p;
                        }
                        if (iOrdinal3 == 58) {
                            nw6.h("SET_PROPERTY", 3, arrayList);
                            ez5 ez5VarB10 = ma5Var.b((ez5) arrayList.get(0));
                            ez5 ez5VarB11 = ma5Var.b((ez5) arrayList.get(1));
                            ez5 ez5VarB12 = ma5Var.b((ez5) arrayList.get(2));
                            if (ez5VarB10 == ez5.o || ez5VarB10 == ez5.p) {
                                throw new IllegalStateException(String.format("Can't set property %s of %s", ez5VarB11.zzi(), ez5VarB10.zzi()));
                            }
                            if ((ez5VarB10 instanceof hu5) && (ez5VarB11 instanceof gw5)) {
                                ((hu5) ez5VarB10).p(ez5VarB11.zzh().intValue(), ez5VarB12);
                                return ez5VarB12;
                            }
                            if (!(ez5VarB10 instanceof by5)) {
                                return ez5VarB12;
                            }
                            ((by5) ez5VarB10).b(ez5VarB11.zzi(), ez5VarB12);
                            return ez5VarB12;
                        }
                        if (iOrdinal3 == 17) {
                            if (arrayList.isEmpty()) {
                                return new hu5();
                            }
                            hu5Var = new hu5();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ez5 ez5VarB13 = ma5Var.b((ez5) it.next());
                                if (ez5VarB13 instanceof uv5) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                hu5Var.p(i, ez5VarB13);
                                i++;
                            }
                        } else if (iOrdinal3 != 18) {
                            if (iOrdinal3 == 35 || iOrdinal3 == 36) {
                                nw6.h("GET_PROPERTY", 2, arrayList);
                                ez5 ez5VarB14 = ma5Var.b((ez5) arrayList.get(0));
                                ez5 ez5VarB15 = ma5Var.b((ez5) arrayList.get(1));
                                if ((ez5VarB14 instanceof hu5) && nw6.k(ez5VarB15)) {
                                    return ((hu5) ez5VarB14).e(ez5VarB15.zzh().intValue());
                                }
                                if (ez5VarB14 instanceof by5) {
                                    return ((by5) ez5VarB14).zzf(ez5VarB15.zzi());
                                }
                                if (ez5VarB14 instanceof f06) {
                                    if ("length".equals(ez5VarB15.zzi())) {
                                        return new gw5(Double.valueOf(ez5VarB14.zzi().length()));
                                    }
                                    if (nw6.k(ez5VarB15) && ez5VarB15.zzh().doubleValue() < ez5VarB14.zzi().length()) {
                                        ez5VarB = new f06(String.valueOf(ez5VarB14.zzi().charAt(ez5VarB15.zzh().intValue())));
                                    }
                                }
                                return ez5.o;
                            }
                            switch (iOrdinal3) {
                                case 62:
                                    nw6.h("TYPEOF", 1, arrayList);
                                    ez5 ez5VarB16 = ma5Var.b((ez5) arrayList.get(0));
                                    if (ez5VarB16 instanceof n06) {
                                        str2 = AdError.UNDEFINED_DOMAIN;
                                    } else if (ez5VarB16 instanceof av5) {
                                        str2 = "boolean";
                                    } else if (ez5VarB16 instanceof gw5) {
                                        str2 = "number";
                                    } else if (ez5VarB16 instanceof f06) {
                                        str2 = "string";
                                    } else if (ez5VarB16 instanceof az5) {
                                        str2 = "function";
                                    } else {
                                        if ((ez5VarB16 instanceof mz5) || (ez5VarB16 instanceof uv5)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", ez5VarB16));
                                        }
                                        str2 = "object";
                                    }
                                    ez5VarB = new f06(str2);
                                    break;
                                case 63:
                                    nw6.h("UNDEFINED", 0, arrayList);
                                    return ez5.o;
                                case 64:
                                    nw6.i("VAR", 1, arrayList);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        ez5 ez5VarB17 = ma5Var.b((ez5) it2.next());
                                        if (!(ez5VarB17 instanceof f06)) {
                                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", ez5VarB17.getClass().getCanonicalName()));
                                        }
                                        ma5Var.f(ez5VarB17.zzi(), ez5.o);
                                    }
                                    return ez5.o;
                                default:
                                    b(str);
                                    throw null;
                            }
                        } else {
                            if (arrayList.isEmpty()) {
                                return new hy5();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                            }
                            hu5Var = new hy5();
                            while (i < arrayList.size() - 1) {
                                ez5 ez5VarB18 = ma5Var.b((ez5) arrayList.get(i));
                                ez5 ez5VarB19 = ma5Var.b((ez5) arrayList.get(i + 1));
                                if ((ez5VarB18 instanceof uv5) || (ez5VarB19 instanceof uv5)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                hu5Var.b(ez5VarB18.zzi(), ez5VarB19);
                                i += 2;
                            }
                        }
                    }
                    return hu5Var;
                }
                nw6.h("ASSIGN", 2, arrayList);
                ez5 ez5VarB20 = ma5Var.b((ez5) arrayList.get(0));
                if (!(ez5VarB20 instanceof f06)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", ez5VarB20.getClass().getCanonicalName()));
                }
                if (!ma5Var.j(ez5VarB20.zzi())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", ez5VarB20.zzi()));
                }
                ez5VarB = ma5Var.b((ez5) arrayList.get(1));
                ma5Var.h(ez5VarB20.zzi(), ez5VarB);
                return ez5VarB;
        }
    }
}
