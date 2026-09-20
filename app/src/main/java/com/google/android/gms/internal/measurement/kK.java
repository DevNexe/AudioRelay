package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdRequest;
import defpackage.a07;
import defpackage.a37;
import defpackage.at6;
import defpackage.b17;
import defpackage.bz6;
import defpackage.c07;
import defpackage.d27;
import defpackage.e17;
import defpackage.e57;
import defpackage.ez6;
import defpackage.f27;
import defpackage.j07;
import defpackage.j37;
import defpackage.l07;
import defpackage.l37;
import defpackage.m07;
import defpackage.m47;
import defpackage.n47;
import defpackage.o37;
import defpackage.q07;
import defpackage.q37;
import defpackage.r07;
import defpackage.s17;
import defpackage.s27;
import defpackage.s57;
import defpackage.v17;
import defpackage.v37;
import defpackage.x37;
import defpackage.y37;
import defpackage.z37;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class kK<T> implements y37<T> {
    public static final int[] n = new int[0];
    public static final Unsafe o = e57.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final q37 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final s27 k;
    public final m47 l;
    public final r07 m;

    public kK(int[] iArr, Object[] objArr, int i, int i2, q37 q37Var, boolean z, int[] iArr2, int i3, int i4, s27 s27Var, m47 m47Var, r07 r07Var, l37 l37Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        this.f = r07Var != null && r07Var.c(q37Var);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = s27Var;
        this.l = m47Var;
        this.m = r07Var;
        this.e = q37Var;
    }

    public static long g(long j, Object obj) {
        return ((Long) e57.j(j, obj)).longValue();
    }

    public static Field j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static final void s(int i, Object obj, l07 l07Var) {
        if (!(obj instanceof String)) {
            l07Var.f(i, (a07) obj);
        } else {
            l07Var.a.p(i, (String) obj);
        }
    }

    public static n47 u(Object obj) {
        vDR vdr = (vDR) obj;
        n47 n47Var = vdr.zzc;
        if (n47Var != n47.f) {
            return n47Var;
        }
        n47 n47VarB = n47.b();
        vdr.zzc = n47VarB;
        return n47VarB;
    }

    public static kK v(o37 o37Var, s27 s27Var, m47 m47Var, r07 r07Var, l37 l37Var) {
        if (o37Var instanceof x37) {
            return w((x37) o37Var, s27Var, m47Var, r07Var, l37Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:127:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x027d  */
    public static kK w(x37 x37Var, s27 s27Var, m47 m47Var, r07 r07Var, l37 l37Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldJ;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldJ2;
        int i25;
        Object obj2;
        Field fieldJ3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = x37Var.zzc() == 2;
        String strA = x37Var.a();
        int length = strA.length();
        char c = 55296;
        if (strA.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strA.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt4 = strA.charAt(i);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strA.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt4 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt4 == 0) {
            iArr = n;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i5 = 0;
            i4 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt5 = strA.charAt(i31);
            if (iCharAt5 >= 55296) {
                int i35 = iCharAt5 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    cCharAt8 = strA.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                iCharAt5 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt6 = strA.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt7 = strA.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            iCharAt = strA.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt6 = strA.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            iCharAt2 = strA.charAt(i40);
            if (iCharAt2 >= 55296) {
                int i44 = iCharAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt5 = strA.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt2 = i44 | (cCharAt5 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt3 = strA.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt4 = strA.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt3 = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int iCharAt7 = strA.charAt(i46);
            if (iCharAt7 >= 55296) {
                int i50 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt3 = strA.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt7 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strA.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt2 = strA.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strA.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strA.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt9 = i56 | (cCharAt << i57);
                i55 = i6;
            }
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i31 = i55;
            int i58 = iCharAt9;
            i4 = iCharAt7;
            i5 = i58;
        }
        Object[] objArrB = x37Var.b();
        Class<?> cls = x37Var.zza().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i59 = i4 + i5;
        int i60 = i5;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strA.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strA.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strA.charAt(i14);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strA.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = i59;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            Unsafe unsafe = o;
            int i74 = i5;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int iCharAt12 = strA.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i26 = i77 + 1;
                        cCharAt10 = strA.charAt(i77);
                        i17 = iCharAt2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i26;
                        iCharAt2 = i17;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i22 = i26;
                } else {
                    i17 = iCharAt2;
                    i22 = i75;
                }
                int i79 = i72 - 51;
                int i80 = i22;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i63 / 3;
                    i23 = i2 + 1;
                    objArr[i81 + i81 + 1] = objArrB[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i63 / 3;
                        i23 = i2 + 1;
                        objArr[i82 + i82 + 1] = objArrB[i2];
                    }
                    i24 = iCharAt12 + iCharAt12;
                    obj = objArrB[i24];
                    if (obj instanceof Field) {
                        fieldJ2 = (Field) obj;
                    } else {
                        fieldJ2 = j(cls, (String) obj);
                        objArrB[i24] = fieldJ2;
                    }
                    int i83 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldJ2);
                    i25 = i24 + 1;
                    obj2 = objArrB[i25];
                    if (obj2 instanceof Field) {
                        fieldJ3 = (Field) obj2;
                    } else {
                        fieldJ3 = j(cls, (String) obj2);
                        objArrB[i25] = fieldJ3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ3);
                    i20 = i80;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = i2;
                    i18 = i83;
                    objArrB = objArrB;
                }
                i2 = i23;
                i24 = iCharAt12 + iCharAt12;
                obj = objArrB[i24];
                if (obj instanceof Field) {
                    fieldJ2 = (Field) obj;
                } else {
                    fieldJ2 = j(cls, (String) obj);
                    objArrB[i24] = fieldJ2;
                }
                int i84 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldJ2);
                i25 = i24 + 1;
                obj2 = objArrB[i25];
                if (obj2 instanceof Field) {
                    fieldJ3 = (Field) obj2;
                } else {
                    fieldJ3 = j(cls, (String) obj2);
                    objArrB[i25] = fieldJ3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ3);
                i20 = i80;
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
                i19 = i2;
                i18 = i84;
                objArrB = objArrB;
            } else {
                int i85 = iCharAt;
                i17 = iCharAt2;
                int i86 = i2 + 1;
                Field fieldJ4 = j(cls, (String) objArrB[i2]);
                i18 = i85;
                if (i72 == 9 || i72 == 17) {
                    int i87 = i63 / 3;
                    objArr[i87 + i87 + 1] = fieldJ4.getType();
                } else if (i72 == 27 || i72 == 49) {
                    int i88 = i63 / 3;
                    objArr[i88 + i88 + 1] = objArrB[i86];
                    i86++;
                } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                    if (!z) {
                        int i89 = i63 / 3;
                        objArr[i89 + i89 + 1] = objArrB[i86];
                        i86++;
                    }
                } else if (i72 == 50) {
                    int i90 = i60 + 1;
                    iArr[i60] = i63;
                    int i91 = i63 / 3;
                    int i92 = i91 + i91;
                    int i93 = i86 + 1;
                    objArr[i92] = objArrB[i86];
                    if ((iCharAt11 & 2048) != 0) {
                        i86 = i93 + 1;
                        objArr[i92 + 1] = objArrB[i93];
                    } else {
                        i86 = i93;
                    }
                    i60 = i90;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                i19 = i86;
                if ((iCharAt11 & 4096) != 4096 || i72 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i94 = i16 + 1;
                    int iCharAt13 = strA.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i95 = iCharAt13 & 8191;
                        int i96 = 13;
                        while (true) {
                            i20 = i94 + 1;
                            cCharAt9 = strA.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i20;
                        }
                        iCharAt13 = i95 | (cCharAt9 << i96);
                    } else {
                        i20 = i94;
                    }
                    int i97 = (iCharAt13 / 32) + i3 + i3;
                    Object obj3 = objArrB[i97];
                    if (obj3 instanceof Field) {
                        fieldJ = (Field) obj3;
                    } else {
                        fieldJ = j(cls, (String) obj3);
                        objArrB[i97] = fieldJ;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ);
                    i21 = iCharAt13 % 32;
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
            }
            int i98 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i99 = i98 + 1;
            iArr2[i98] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
            i63 = i99 + 1;
            iArr2[i99] = (i21 << 20) | iObjectFieldOffset2;
            objArrB = objArrB;
            iCharAt = i18;
            i59 = i73;
            length = i15;
            i2 = i19;
            i31 = i20;
            i5 = i74;
            iCharAt2 = i17;
            c = 55296;
        }
        return new kK(iArr2, objArr, iCharAt, iCharAt2, x37Var.zza(), z, iArr, i5, i59, s27Var, m47Var, r07Var, l37Var);
    }

    public static int z(long j, Object obj) {
        return ((Integer) e57.j(j, obj)).intValue();
    }

    public final void A(Object obj, int i, long j) {
        Object objI = i(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        if (!((j37) object).h()) {
            j37 j37VarC = j37.a().c();
            l37.b(j37VarC, object);
            unsafe.putObject(obj, j, j37VarC);
        }
        throw null;
    }

    public final int B(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, at6 at6Var) throws zzko {
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(bz6.n(i, bArr))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(bz6.b(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM = bz6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Long.valueOf(at6Var.b));
                unsafe.putInt(obj, j2, i4);
                return iM;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iJ = bz6.j(bArr, i, at6Var);
                unsafe.putObject(obj, j, Integer.valueOf(at6Var.a));
                unsafe.putInt(obj, j2, i4);
                return iJ;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(bz6.n(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(bz6.b(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM2 = bz6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Boolean.valueOf(at6Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iJ2 = bz6.j(bArr, i, at6Var);
                int i9 = at6Var.a;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !s57.d(bArr, iJ2, iJ2 + i9)) {
                        throw zzko.a();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iJ2, i9, f27.a));
                    iJ2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iJ2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iD = bz6.d(h(i8), bArr, i, i2, at6Var);
                Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, at6Var.c);
                } else {
                    unsafe.putObject(obj, j, f27.b(object, at6Var.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iD;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iA = bz6.a(bArr, i, at6Var);
                unsafe.putObject(obj, j, at6Var.c);
                unsafe.putInt(obj, j2, i4);
                return iA;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iJ3 = bz6.j(bArr, i, at6Var);
                int i10 = at6Var.a;
                int i11 = i8 / 3;
                v17 v17Var = (v17) this.b[i11 + i11 + 1];
                if (v17Var == null || v17Var.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    u(obj).c(i3, Long.valueOf(i10));
                }
                return iJ3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iJ4 = bz6.j(bArr, i, at6Var);
                unsafe.putObject(obj, j, Integer.valueOf(c07.a(at6Var.a)));
                unsafe.putInt(obj, j2, i4);
                return iJ4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM3 = bz6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Long.valueOf(c07.b(at6Var.b)));
                unsafe.putInt(obj, j2, i4);
                return iM3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iC = bz6.c(h(i8), bArr, i, i2, (i3 & (-8)) | 4, at6Var);
                Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, at6Var.c);
                } else {
                    unsafe.putObject(obj, j, f27.b(object2, at6Var.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iC;
            default:
                return i;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x009f. Please report as an issue. */
    public final void C(Object obj, byte[] bArr, int i, int i2, at6 at6Var) throws zzko {
        int i3;
        int i4;
        int iE;
        int iE2;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        kK<T> kKVar;
        int i16;
        int i17;
        int i18;
        int iM;
        int iJ;
        Object obj3 = obj;
        Unsafe unsafe2 = o;
        kK<T> kKVar2 = this;
        byte[] bArr2 = bArr;
        int iB = i;
        int i19 = i2;
        Object obj4 = obj3;
        int i20 = -1;
        int i21 = 0;
        int i22 = 1048575;
        int i23 = 0;
        while (iB < i19) {
            int i24 = iB + 1;
            byte b = bArr2[iB];
            if (b < 0) {
                int iK = bz6.k(b, bArr2, i24, at6Var);
                i3 = at6Var.a;
                i24 = iK;
            } else {
                i3 = b;
            }
            int i25 = i3 >>> 3;
            int i26 = i3 & 7;
            int i27 = kKVar2.d;
            int i28 = kKVar2.c;
            if (i25 > i20) {
                iE2 = (i25 < i28 || i25 > i27) ? -1 : kKVar2.E(i25, i21 / 3);
                i5 = -1;
                i4 = 0;
            } else {
                if (i25 < i28 || i25 > i27) {
                    i4 = 0;
                    iE = -1;
                } else {
                    i4 = 0;
                    iE = kKVar2.E(i25, 0);
                }
                iE2 = iE;
                i5 = -1;
            }
            if (iE2 == i5) {
                i7 = i25;
                i15 = i24;
                unsafe = unsafe2;
            } else {
                int[] iArr = kKVar2.a;
                int i29 = iArr[iE2 + 1];
                int i30 = (i29 >>> 20) & 255;
                long j = i29 & 1048575;
                if (i30 <= 17) {
                    int i31 = iArr[iE2 + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = 1048575;
                    int i34 = i31 & 1048575;
                    if (i34 != i22) {
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj4, i22, i23);
                            i33 = 1048575;
                        }
                        if (i34 != i33) {
                            i23 = unsafe2.getInt(obj4, i34);
                        }
                        i22 = i34;
                    }
                    switch (i30) {
                        case 0:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 1) {
                                e57.n(obj2, j, Double.longBitsToDouble(bz6.n(i16, bArr2)));
                                i18 = i16 + 8;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 1:
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 5) {
                                e57.o(obj2, j, Float.intBitsToFloat(bz6.b(bArr2, i16)));
                                i18 = i16 + 4;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 2:
                        case 3:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iM = bz6.m(bArr2, i16, at6Var);
                                unsafe2.putLong(obj, j, at6Var.b);
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 4:
                        case 11:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bz6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, at6Var.a);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 5:
                        case 14:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 1) {
                                unsafe2.putLong(obj, j, bz6.n(i16, bArr2));
                                i18 = i16 + 8;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i16 = i16;
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 6:
                        case 13:
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 5) {
                                unsafe2.putInt(obj2, j, bz6.b(bArr2, i16));
                                i18 = i16 + 4;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i16 = i16;
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 7:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bz6.m(bArr2, i16, at6Var);
                                e57.m(obj2, j, at6Var.b != 0);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 8:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = (i29 & 536870912) == 0 ? bz6.g(bArr2, i16, at6Var) : bz6.h(bArr2, i16, at6Var);
                                unsafe2.putObject(obj2, j, at6Var.c);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 9:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = bz6.d(kKVar2.h(iE2), bArr2, i16, i19, at6Var);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, at6Var.c);
                                } else {
                                    unsafe2.putObject(obj2, j, f27.b(object, at6Var.c));
                                }
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 10:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = bz6.a(bArr2, i16, at6Var);
                                unsafe2.putObject(obj2, j, at6Var.c);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 12:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bz6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, at6Var.a);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 15:
                            kKVar2 = kKVar2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bz6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, c07.a(at6Var.a));
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                        case 16:
                            if (i26 == 0) {
                                iM = bz6.m(bArr2, i24, at6Var);
                                i7 = i25;
                                kKVar2 = kKVar2;
                                i17 = i22;
                                obj2 = obj4;
                                unsafe2.putLong(obj, j, c07.b(at6Var.b));
                                i23 |= i32;
                                i6 = i17;
                                iB = iM;
                                kKVar = kKVar2;
                                obj4 = obj2;
                                kKVar2 = kKVar;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iE2;
                                i22 = i6;
                                break;
                            }
                        default:
                            i7 = i25;
                            i17 = i22;
                            i16 = i24;
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iE2;
                            break;
                    }
                } else {
                    kK<T> kKVar3 = kKVar2;
                    i6 = i22;
                    obj2 = obj4;
                    i7 = i25;
                    if (i30 == 27) {
                        if (i26 == 2) {
                            d27 d27VarZzd = (d27) unsafe2.getObject(obj2, j);
                            if (!d27VarZzd.zzc()) {
                                int size = d27VarZzd.size();
                                d27VarZzd = d27VarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, d27VarZzd);
                            }
                            kKVar = kKVar3;
                            iB = bz6.e(kKVar3.h(iE2), i3, bArr, i24, i2, d27VarZzd, at6Var);
                            obj4 = obj2;
                            kKVar2 = kKVar;
                            bArr2 = bArr2;
                            unsafe = unsafe2;
                            i21 = iE2;
                            i22 = i6;
                        } else {
                            i8 = i24;
                            i9 = i23;
                            unsafe = unsafe2;
                            i10 = iE2;
                            i11 = i6;
                        }
                    } else if (i30 <= 49) {
                        int i35 = i24;
                        i11 = i6;
                        i9 = i23;
                        unsafe = unsafe2;
                        int i36 = iE2;
                        iB = D(obj, bArr, i24, i2, i3, i7, i26, iE2, i29, i30, j, at6Var);
                        if (iB != i35) {
                            obj3 = obj;
                            i12 = i36;
                            i14 = i12;
                            i23 = i9;
                            i22 = i11;
                            kKVar2 = this;
                            bArr2 = bArr;
                            i19 = i2;
                            i21 = i14;
                            obj4 = obj3;
                        } else {
                            obj3 = obj;
                            i13 = iB;
                            i12 = i36;
                            i15 = i13;
                            i4 = i12;
                            i23 = i9;
                            i22 = i11;
                        }
                    } else {
                        i8 = i24;
                        i9 = i23;
                        unsafe = unsafe2;
                        i10 = iE2;
                        i11 = i6;
                        if (i30 != 50) {
                            obj3 = obj;
                            i12 = i10;
                            iB = B(obj, bArr, i8, i2, i3, i7, i26, i29, i30, j, i10, at6Var);
                            if (iB != i8) {
                                i14 = i12;
                                i23 = i9;
                                i22 = i11;
                            } else {
                                i13 = iB;
                            }
                            kKVar2 = this;
                            bArr2 = bArr;
                            i19 = i2;
                            i21 = i14;
                            obj4 = obj3;
                        } else if (i26 == 2) {
                            A(obj, i10, j);
                            throw null;
                        }
                        i15 = i13;
                        i4 = i12;
                        i23 = i9;
                        i22 = i11;
                    }
                    i13 = i8;
                    i12 = i10;
                    obj3 = obj;
                    i15 = i13;
                    i4 = i12;
                    i23 = i9;
                    i22 = i11;
                }
                i20 = i7;
                unsafe2 = unsafe;
            }
            iB = bz6.i(i3, bArr, i15, i2, u(obj), at6Var);
            i14 = i4;
            kKVar2 = this;
            bArr2 = bArr;
            i19 = i2;
            i21 = i14;
            obj4 = obj3;
            i20 = i7;
            unsafe2 = unsafe;
        }
        int i37 = i23;
        Unsafe unsafe3 = unsafe2;
        if (i22 != 1048575) {
            unsafe3.putInt(obj3, i22, i37);
        }
        if (iB != i2) {
            throw zzko.c();
        }
    }

    public final int D(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, at6 at6Var) throws zzko {
        int i8;
        int i9;
        int i10;
        int i11;
        int iJ;
        int iJ2 = i;
        Unsafe unsafe = o;
        d27 d27VarZzd = (d27) unsafe.getObject(obj, j2);
        if (!d27VarZzd.zzc()) {
            int size = d27VarZzd.size();
            d27VarZzd = d27VarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, d27VarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    m07 m07Var = (m07) d27VarZzd;
                    int iJ3 = bz6.j(bArr, iJ2, at6Var);
                    int i12 = at6Var.a + iJ3;
                    while (iJ3 < i12) {
                        m07Var.b(Double.longBitsToDouble(bz6.n(iJ3, bArr)));
                        iJ3 += 8;
                    }
                    if (iJ3 == i12) {
                        return iJ3;
                    }
                    throw zzko.d();
                }
                if (i5 == 1) {
                    m07 m07Var2 = (m07) d27VarZzd;
                    m07Var2.b(Double.longBitsToDouble(bz6.n(iJ2, bArr)));
                    while (true) {
                        i8 = iJ2 + 8;
                        if (i8 < i2) {
                            int iJ4 = bz6.j(bArr, i8, at6Var);
                            if (i3 == at6Var.a) {
                                m07Var2.b(Double.longBitsToDouble(bz6.n(iJ4, bArr)));
                                iJ2 = iJ4;
                            }
                        }
                    }
                    return i8;
                }
                return iJ2;
            case 19:
            case 36:
                if (i5 == 2) {
                    e17 e17Var = (e17) d27VarZzd;
                    int iJ5 = bz6.j(bArr, iJ2, at6Var);
                    int i13 = at6Var.a + iJ5;
                    while (iJ5 < i13) {
                        e17Var.b(Float.intBitsToFloat(bz6.b(bArr, iJ5)));
                        iJ5 += 4;
                    }
                    if (iJ5 == i13) {
                        return iJ5;
                    }
                    throw zzko.d();
                }
                if (i5 == 5) {
                    e17 e17Var2 = (e17) d27VarZzd;
                    e17Var2.b(Float.intBitsToFloat(bz6.b(bArr, i)));
                    while (true) {
                        i9 = iJ2 + 4;
                        if (i9 < i2) {
                            int iJ6 = bz6.j(bArr, i9, at6Var);
                            if (i3 == at6Var.a) {
                                e17Var2.b(Float.intBitsToFloat(bz6.b(bArr, iJ6)));
                                iJ2 = iJ6;
                            }
                        }
                    }
                    return i9;
                }
                return iJ2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    a37 a37Var = (a37) d27VarZzd;
                    int iJ7 = bz6.j(bArr, iJ2, at6Var);
                    int i14 = at6Var.a + iJ7;
                    while (iJ7 < i14) {
                        iJ7 = bz6.m(bArr, iJ7, at6Var);
                        a37Var.b(at6Var.b);
                    }
                    if (iJ7 == i14) {
                        return iJ7;
                    }
                    throw zzko.d();
                }
                if (i5 == 0) {
                    a37 a37Var2 = (a37) d27VarZzd;
                    int iM = bz6.m(bArr, iJ2, at6Var);
                    a37Var2.b(at6Var.b);
                    while (iM < i2) {
                        int iJ8 = bz6.j(bArr, iM, at6Var);
                        if (i3 != at6Var.a) {
                            return iM;
                        }
                        iM = bz6.m(bArr, iJ8, at6Var);
                        a37Var2.b(at6Var.b);
                    }
                    return iM;
                }
                return iJ2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return bz6.f(bArr, iJ2, d27VarZzd, at6Var);
                }
                if (i5 == 0) {
                    return bz6.l(i3, bArr, i, i2, d27VarZzd, at6Var);
                }
                return iJ2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    a37 a37Var3 = (a37) d27VarZzd;
                    int iJ9 = bz6.j(bArr, iJ2, at6Var);
                    int i15 = at6Var.a + iJ9;
                    while (iJ9 < i15) {
                        a37Var3.b(bz6.n(iJ9, bArr));
                        iJ9 += 8;
                    }
                    if (iJ9 == i15) {
                        return iJ9;
                    }
                    throw zzko.d();
                }
                if (i5 == 1) {
                    a37 a37Var4 = (a37) d27VarZzd;
                    a37Var4.b(bz6.n(iJ2, bArr));
                    while (true) {
                        i10 = iJ2 + 8;
                        if (i10 < i2) {
                            int iJ10 = bz6.j(bArr, i10, at6Var);
                            if (i3 == at6Var.a) {
                                a37Var4.b(bz6.n(iJ10, bArr));
                                iJ2 = iJ10;
                            }
                        }
                    }
                    return i10;
                }
                return iJ2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    s17 s17Var = (s17) d27VarZzd;
                    int iJ11 = bz6.j(bArr, iJ2, at6Var);
                    int i16 = at6Var.a + iJ11;
                    while (iJ11 < i16) {
                        s17Var.zzh(bz6.b(bArr, iJ11));
                        iJ11 += 4;
                    }
                    if (iJ11 == i16) {
                        return iJ11;
                    }
                    throw zzko.d();
                }
                if (i5 == 5) {
                    s17 s17Var2 = (s17) d27VarZzd;
                    s17Var2.zzh(bz6.b(bArr, i));
                    while (true) {
                        i11 = iJ2 + 4;
                        if (i11 < i2) {
                            int iJ12 = bz6.j(bArr, i11, at6Var);
                            if (i3 == at6Var.a) {
                                s17Var2.zzh(bz6.b(bArr, iJ12));
                                iJ2 = iJ12;
                            }
                        }
                    }
                    return i11;
                }
                return iJ2;
            case 25:
            case 42:
                if (i5 == 2) {
                    ez6 ez6Var = (ez6) d27VarZzd;
                    iJ = bz6.j(bArr, iJ2, at6Var);
                    int i17 = at6Var.a + iJ;
                    while (iJ < i17) {
                        iJ = bz6.m(bArr, iJ, at6Var);
                        ez6Var.b(at6Var.b != 0);
                    }
                    if (iJ != i17) {
                        throw zzko.d();
                    }
                    return iJ;
                }
                if (i5 == 0) {
                    ez6 ez6Var2 = (ez6) d27VarZzd;
                    int iM2 = bz6.m(bArr, iJ2, at6Var);
                    ez6Var2.b(at6Var.b != 0);
                    while (iM2 < i2) {
                        int iJ13 = bz6.j(bArr, iM2, at6Var);
                        if (i3 != at6Var.a) {
                            return iM2;
                        }
                        iM2 = bz6.m(bArr, iJ13, at6Var);
                        ez6Var2.b(at6Var.b != 0);
                    }
                    return iM2;
                }
                return iJ2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iJ2 = bz6.j(bArr, iJ2, at6Var);
                        int i18 = at6Var.a;
                        if (i18 < 0) {
                            throw zzko.b();
                        }
                        if (i18 == 0) {
                            d27VarZzd.add("");
                        } else {
                            d27VarZzd.add(new String(bArr, iJ2, i18, f27.a));
                            iJ2 += i18;
                        }
                        while (iJ2 < i2) {
                            int iJ14 = bz6.j(bArr, iJ2, at6Var);
                            if (i3 == at6Var.a) {
                                iJ2 = bz6.j(bArr, iJ14, at6Var);
                                int i19 = at6Var.a;
                                if (i19 < 0) {
                                    throw zzko.b();
                                }
                                if (i19 == 0) {
                                    d27VarZzd.add("");
                                } else {
                                    d27VarZzd.add(new String(bArr, iJ2, i19, f27.a));
                                    iJ2 += i19;
                                }
                            }
                        }
                    } else {
                        iJ2 = bz6.j(bArr, iJ2, at6Var);
                        int i20 = at6Var.a;
                        if (i20 < 0) {
                            throw zzko.b();
                        }
                        if (i20 == 0) {
                            d27VarZzd.add("");
                        } else {
                            int i21 = iJ2 + i20;
                            if (!s57.d(bArr, iJ2, i21)) {
                                throw zzko.a();
                            }
                            d27VarZzd.add(new String(bArr, iJ2, i20, f27.a));
                            iJ2 = i21;
                        }
                        while (iJ2 < i2) {
                            int iJ15 = bz6.j(bArr, iJ2, at6Var);
                            if (i3 == at6Var.a) {
                                iJ2 = bz6.j(bArr, iJ15, at6Var);
                                int i22 = at6Var.a;
                                if (i22 < 0) {
                                    throw zzko.b();
                                }
                                if (i22 == 0) {
                                    d27VarZzd.add("");
                                } else {
                                    int i23 = iJ2 + i22;
                                    if (!s57.d(bArr, iJ2, i23)) {
                                        throw zzko.a();
                                    }
                                    d27VarZzd.add(new String(bArr, iJ2, i22, f27.a));
                                    iJ2 = i23;
                                }
                            }
                        }
                    }
                }
                return iJ2;
            case 27:
                if (i5 == 2) {
                    return bz6.e(h(i6), i3, bArr, i, i2, d27VarZzd, at6Var);
                }
                return iJ2;
            case 28:
                if (i5 == 2) {
                    int iJ16 = bz6.j(bArr, iJ2, at6Var);
                    int i24 = at6Var.a;
                    if (i24 < 0) {
                        throw zzko.b();
                    }
                    if (i24 > bArr.length - iJ16) {
                        throw zzko.d();
                    }
                    if (i24 == 0) {
                        d27VarZzd.add(a07.x);
                    } else {
                        d27VarZzd.add(a07.p(bArr, iJ16, i24));
                        iJ16 += i24;
                    }
                    while (iJ16 < i2) {
                        int iJ17 = bz6.j(bArr, iJ16, at6Var);
                        if (i3 != at6Var.a) {
                            return iJ16;
                        }
                        iJ16 = bz6.j(bArr, iJ17, at6Var);
                        int i25 = at6Var.a;
                        if (i25 < 0) {
                            throw zzko.b();
                        }
                        if (i25 > bArr.length - iJ16) {
                            throw zzko.d();
                        }
                        if (i25 == 0) {
                            d27VarZzd.add(a07.x);
                        } else {
                            d27VarZzd.add(a07.p(bArr, iJ16, i25));
                            iJ16 += i25;
                        }
                    }
                    return iJ16;
                }
                return iJ2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iJ = bz6.l(i3, bArr, i, i2, d27VarZzd, at6Var);
                    }
                    return iJ2;
                }
                iJ = bz6.f(bArr, iJ2, d27VarZzd, at6Var);
                vDR vdr = (vDR) obj;
                n47 n47Var = vdr.zzc;
                if (n47Var == n47.f) {
                    n47Var = null;
                }
                int i26 = i6 / 3;
                Object objA = z37.a(i4, d27VarZzd, (v17) this.b[i26 + i26 + 1], n47Var, this.l);
                if (objA != null) {
                    vdr.zzc = (n47) objA;
                    return iJ;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    s17 s17Var3 = (s17) d27VarZzd;
                    int iJ18 = bz6.j(bArr, iJ2, at6Var);
                    int i27 = at6Var.a + iJ18;
                    while (iJ18 < i27) {
                        iJ18 = bz6.j(bArr, iJ18, at6Var);
                        s17Var3.zzh(c07.a(at6Var.a));
                    }
                    if (iJ18 == i27) {
                        return iJ18;
                    }
                    throw zzko.d();
                }
                if (i5 == 0) {
                    s17 s17Var4 = (s17) d27VarZzd;
                    int iJ19 = bz6.j(bArr, iJ2, at6Var);
                    s17Var4.zzh(c07.a(at6Var.a));
                    while (iJ19 < i2) {
                        int iJ20 = bz6.j(bArr, iJ19, at6Var);
                        if (i3 != at6Var.a) {
                            return iJ19;
                        }
                        iJ19 = bz6.j(bArr, iJ20, at6Var);
                        s17Var4.zzh(c07.a(at6Var.a));
                    }
                    return iJ19;
                }
                return iJ2;
            case 34:
            case 48:
                if (i5 == 2) {
                    a37 a37Var5 = (a37) d27VarZzd;
                    int iJ21 = bz6.j(bArr, iJ2, at6Var);
                    int i28 = at6Var.a + iJ21;
                    while (iJ21 < i28) {
                        iJ21 = bz6.m(bArr, iJ21, at6Var);
                        a37Var5.b(c07.b(at6Var.b));
                    }
                    if (iJ21 == i28) {
                        return iJ21;
                    }
                    throw zzko.d();
                }
                if (i5 == 0) {
                    a37 a37Var6 = (a37) d27VarZzd;
                    int iM3 = bz6.m(bArr, iJ2, at6Var);
                    a37Var6.b(c07.b(at6Var.b));
                    while (iM3 < i2) {
                        int iJ22 = bz6.j(bArr, iM3, at6Var);
                        if (i3 != at6Var.a) {
                            return iM3;
                        }
                        iM3 = bz6.m(bArr, iJ22, at6Var);
                        a37Var6.b(c07.b(at6Var.b));
                    }
                    return iM3;
                }
                return iJ2;
            default:
                if (i5 == 3) {
                    y37 y37VarH = h(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int iC = bz6.c(y37VarH, bArr, i, i2, i29, at6Var);
                    d27VarZzd.add(at6Var.c);
                    while (iC < i2) {
                        int iJ23 = bz6.j(bArr, iC, at6Var);
                        if (i3 != at6Var.a) {
                            return iC;
                        }
                        iC = bz6.c(y37VarH, bArr, iJ23, i2, i29, at6Var);
                        d27VarZzd.add(at6Var.c);
                    }
                    return iC;
                }
                return iJ2;
        }
    }

    public final int E(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be A[LOOP:1: B:49:0x00ad->B:54:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[SYNTHETIC] */
    @Override // defpackage.y37
    public final boolean a(Object obj) {
        List list;
        y37 y37VarH;
        int i;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (true) {
            boolean zQ = true;
            if (i2 >= this.i) {
                if (!this.f) {
                    return true;
                }
                this.m.a(obj);
                throw null;
            }
            int i5 = this.h[i2];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int iF = f(i5);
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = o.getInt(obj, i8);
                }
                i3 = i8;
            }
            if ((268435456 & iF) != 0) {
                if (!(i3 == 1048575 ? q(i5, obj) : (i4 & i9) != 0)) {
                    return false;
                }
            }
            int i10 = (iF >>> 20) & 255;
            if (i10 == 9 || i10 == 17) {
                if (i3 == 1048575) {
                    zQ = q(i5, obj);
                } else if ((i4 & i9) == 0) {
                    zQ = false;
                }
                if (zQ && !h(i5).a(e57.j(iF & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) e57.j(iF & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    y37VarH = h(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!y37VarH.a(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i10 == 60 || i10 == 68) {
                if (r(i6, i5, obj) && !h(i5).a(e57.j(iF & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) e57.j(iF & 1048575, obj);
                if (list.isEmpty()) {
                    y37VarH = h(i5);
                    while (i < list.size()) {
                        if (!y37VarH.a(list.get(i))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i10 == 50 && !((j37) e57.j(iF & 1048575, obj)).isEmpty()) {
                throw null;
            }
            i2++;
        }
    }

    @Override // defpackage.y37
    public final void b(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Class cls = z37.a;
                m47 m47Var = this.l;
                m47Var.h(obj, m47Var.d(m47Var.c(obj), m47Var.c(obj2)));
                if (this.f) {
                    this.m.a(obj2);
                    throw null;
                }
                return;
            }
            int iF = f(i);
            long j = 1048575 & iF;
            int i2 = iArr[i];
            switch ((iF >>> 20) & 255) {
                case 0:
                    if (q(i, obj2)) {
                        e57.n(obj, j, e57.e(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 1:
                    if (q(i, obj2)) {
                        e57.o(obj, j, e57.f(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 2:
                    if (q(i, obj2)) {
                        e57.c.D(obj, j, e57.h(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 3:
                    if (q(i, obj2)) {
                        e57.c.D(obj, j, e57.h(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 4:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 5:
                    if (q(i, obj2)) {
                        e57.c.D(obj, j, e57.h(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 6:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 7:
                    if (q(i, obj2)) {
                        e57.m(obj, j, e57.s(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 8:
                    if (q(i, obj2)) {
                        e57.q(j, obj, e57.j(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 9:
                    k(i, obj, obj2);
                    break;
                case 10:
                    if (q(i, obj2)) {
                        e57.q(j, obj, e57.j(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 11:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 12:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 13:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 14:
                    if (q(i, obj2)) {
                        e57.c.D(obj, j, e57.h(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 15:
                    if (q(i, obj2)) {
                        e57.p(obj, j, e57.g(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 16:
                    if (q(i, obj2)) {
                        e57.c.D(obj, j, e57.h(j, obj2));
                        m(i, obj);
                    }
                    break;
                case 17:
                    k(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.k.b(j, obj, obj2);
                    break;
                case 50:
                    Class cls2 = z37.a;
                    e57.q(j, obj, l37.b(e57.j(j, obj), e57.j(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (r(i2, i, obj2)) {
                        e57.q(j, obj, e57.j(j, obj2));
                        n(i2, i, obj);
                    }
                    break;
                case 60:
                    l(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i2, i, obj2)) {
                        e57.q(j, obj, e57.j(j, obj2));
                        n(i2, i, obj);
                    }
                    break;
                case 68:
                    l(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // defpackage.y37
    public final boolean c(Object obj, Object obj2) {
        boolean zT;
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iF = f(i);
            long j = iF & 1048575;
            switch ((iF >>> 20) & 255) {
                case 0:
                    if (!p(i, obj, obj2) || Double.doubleToLongBits(e57.e(j, obj)) != Double.doubleToLongBits(e57.e(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!p(i, obj, obj2) || Float.floatToIntBits(e57.f(j, obj)) != Float.floatToIntBits(e57.f(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!p(i, obj, obj2) || e57.h(j, obj) != e57.h(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!p(i, obj, obj2) || e57.h(j, obj) != e57.h(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!p(i, obj, obj2) || e57.h(j, obj) != e57.h(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!p(i, obj, obj2) || e57.s(j, obj) != e57.s(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!p(i, obj, obj2) || !z37.t(e57.j(j, obj), e57.j(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!p(i, obj, obj2) || !z37.t(e57.j(j, obj), e57.j(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!p(i, obj, obj2) || !z37.t(e57.j(j, obj), e57.j(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!p(i, obj, obj2) || e57.h(j, obj) != e57.h(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!p(i, obj, obj2) || e57.g(j, obj) != e57.g(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!p(i, obj, obj2) || e57.h(j, obj) != e57.h(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!p(i, obj, obj2) || !z37.t(e57.j(j, obj), e57.j(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zT = z37.t(e57.j(j, obj), e57.j(j, obj2));
                    break;
                case 50:
                    zT = z37.t(e57.j(j, obj), e57.j(j, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (e57.g(j2, obj) != e57.g(j2, obj2) || !z37.t(e57.j(j, obj), e57.j(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zT) {
                return false;
            }
        }
        m47 m47Var = this.l;
        if (!m47Var.c(obj).equals(m47Var.c(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        r07 r07Var = this.m;
        r07Var.a(obj);
        r07Var.a(obj2);
        throw null;
    }

    @Override // defpackage.y37
    public final void d(Object obj, byte[] bArr, int i, int i2, at6 at6Var) throws zzko {
        if (this.g) {
            C(obj, bArr, i, i2, at6Var);
        } else {
            t(obj, bArr, i, i2, 0, at6Var);
        }
    }

    @Override // defpackage.y37
    public final void e(Object obj, l07 l07Var) throws zzjj {
        if (!this.g) {
            o(obj, l07Var);
            return;
        }
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iF = f(i);
            int i2 = iArr[i];
            switch ((iF >>> 20) & 255) {
                case 0:
                    if (q(i, obj)) {
                        l07Var.g(e57.e(iF & 1048575, obj), i2);
                    }
                    break;
                case 1:
                    if (q(i, obj)) {
                        l07Var.k(e57.f(iF & 1048575, obj), i2);
                    }
                    break;
                case 2:
                    if (q(i, obj)) {
                        l07Var.n(i2, e57.h(iF & 1048575, obj));
                    }
                    break;
                case 3:
                    if (q(i, obj)) {
                        l07Var.d(i2, e57.h(iF & 1048575, obj));
                    }
                    break;
                case 4:
                    if (q(i, obj)) {
                        l07Var.m(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i, obj)) {
                        l07Var.j(i2, e57.h(iF & 1048575, obj));
                    }
                    break;
                case 6:
                    if (q(i, obj)) {
                        l07Var.i(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i, obj)) {
                        l07Var.e(i2, e57.s(iF & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i, obj)) {
                        s(i2, e57.j(iF & 1048575, obj), l07Var);
                    }
                    break;
                case 9:
                    if (q(i, obj)) {
                        l07Var.o(i2, h(i), e57.j(iF & 1048575, obj));
                    }
                    break;
                case 10:
                    if (q(i, obj)) {
                        l07Var.f(i2, (a07) e57.j(iF & 1048575, obj));
                    }
                    break;
                case 11:
                    if (q(i, obj)) {
                        l07Var.c(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 12:
                    if (q(i, obj)) {
                        l07Var.h(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 13:
                    if (q(i, obj)) {
                        l07Var.p(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 14:
                    if (q(i, obj)) {
                        l07Var.q(i2, e57.h(iF & 1048575, obj));
                    }
                    break;
                case 15:
                    if (q(i, obj)) {
                        l07Var.a(i2, e57.g(iF & 1048575, obj));
                    }
                    break;
                case 16:
                    if (q(i, obj)) {
                        l07Var.b(i2, e57.h(iF & 1048575, obj));
                    }
                    break;
                case 17:
                    if (q(i, obj)) {
                        l07Var.l(i2, h(i), e57.j(iF & 1048575, obj));
                    }
                    break;
                case 18:
                    z37.d(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 19:
                    z37.h(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 20:
                    z37.k(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 21:
                    z37.s(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 22:
                    z37.j(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 23:
                    z37.g(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 24:
                    z37.f(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 25:
                    z37.b(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 26:
                    z37.q(i2, (List) e57.j(iF & 1048575, obj), l07Var);
                    break;
                case 27:
                    z37.l(i2, (List) e57.j(iF & 1048575, obj), l07Var, h(i));
                    break;
                case 28:
                    z37.c(i2, (List) e57.j(iF & 1048575, obj), l07Var);
                    break;
                case 29:
                    z37.r(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 30:
                    z37.e(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 31:
                    z37.m(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 32:
                    z37.n(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 33:
                    z37.o(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 34:
                    z37.p(i2, (List) e57.j(iF & 1048575, obj), l07Var, false);
                    break;
                case 35:
                    z37.d(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 36:
                    z37.h(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 37:
                    z37.k(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 38:
                    z37.s(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 39:
                    z37.j(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 40:
                    z37.g(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 41:
                    z37.f(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 42:
                    z37.b(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 43:
                    z37.r(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 44:
                    z37.e(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 45:
                    z37.m(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 46:
                    z37.n(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 47:
                    z37.o(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 48:
                    z37.p(i2, (List) e57.j(iF & 1048575, obj), l07Var, true);
                    break;
                case 49:
                    z37.i(i2, (List) e57.j(iF & 1048575, obj), l07Var, h(i));
                    break;
                case 50:
                    if (e57.j(iF & 1048575, obj) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (r(i2, i, obj)) {
                        l07Var.g(((Double) e57.j(iF & 1048575, obj)).doubleValue(), i2);
                    }
                    break;
                case 52:
                    if (r(i2, i, obj)) {
                        l07Var.k(((Float) e57.j(iF & 1048575, obj)).floatValue(), i2);
                    }
                    break;
                case 53:
                    if (r(i2, i, obj)) {
                        l07Var.n(i2, g(iF & 1048575, obj));
                    }
                    break;
                case 54:
                    if (r(i2, i, obj)) {
                        l07Var.d(i2, g(iF & 1048575, obj));
                    }
                    break;
                case 55:
                    if (r(i2, i, obj)) {
                        l07Var.m(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 56:
                    if (r(i2, i, obj)) {
                        l07Var.j(i2, g(iF & 1048575, obj));
                    }
                    break;
                case 57:
                    if (r(i2, i, obj)) {
                        l07Var.i(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 58:
                    if (r(i2, i, obj)) {
                        l07Var.e(i2, ((Boolean) e57.j(iF & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i2, i, obj)) {
                        s(i2, e57.j(iF & 1048575, obj), l07Var);
                    }
                    break;
                case 60:
                    if (r(i2, i, obj)) {
                        l07Var.o(i2, h(i), e57.j(iF & 1048575, obj));
                    }
                    break;
                case 61:
                    if (r(i2, i, obj)) {
                        l07Var.f(i2, (a07) e57.j(iF & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(i2, i, obj)) {
                        l07Var.c(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(i2, i, obj)) {
                        l07Var.h(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 64:
                    if (r(i2, i, obj)) {
                        l07Var.p(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(i2, i, obj)) {
                        l07Var.q(i2, g(iF & 1048575, obj));
                    }
                    break;
                case 66:
                    if (r(i2, i, obj)) {
                        l07Var.a(i2, z(iF & 1048575, obj));
                    }
                    break;
                case 67:
                    if (r(i2, i, obj)) {
                        l07Var.b(i2, g(iF & 1048575, obj));
                    }
                    break;
                case 68:
                    if (r(i2, i, obj)) {
                        l07Var.l(i2, h(i), e57.j(iF & 1048575, obj));
                    }
                    break;
            }
        }
        m47 m47Var = this.l;
        m47Var.i(m47Var.c(obj), l07Var);
    }

    public final int f(int i) {
        return this.a[i + 1];
    }

    public final y37 h(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        y37 y37Var = (y37) objArr[i3];
        if (y37Var != null) {
            return y37Var;
        }
        y37 y37VarA = v37.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = y37VarA;
        return y37VarA;
    }

    public final Object i(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final void k(int i, Object obj, Object obj2) {
        long jF = f(i) & 1048575;
        if (q(i, obj2)) {
            Object objJ = e57.j(jF, obj);
            Object objJ2 = e57.j(jF, obj2);
            if (objJ != null && objJ2 != null) {
                e57.q(jF, obj, f27.b(objJ, objJ2));
                m(i, obj);
            } else if (objJ2 != null) {
                e57.q(jF, obj, objJ2);
                m(i, obj);
            }
        }
    }

    public final void l(int i, Object obj, Object obj2) {
        int iF = f(i);
        int i2 = this.a[i];
        long j = iF & 1048575;
        if (r(i2, i, obj2)) {
            Object objJ = r(i2, i, obj) ? e57.j(j, obj) : null;
            Object objJ2 = e57.j(j, obj2);
            if (objJ != null && objJ2 != null) {
                e57.q(j, obj, f27.b(objJ, objJ2));
                n(i2, i, obj);
            } else if (objJ2 != null) {
                e57.q(j, obj, objJ2);
                n(i2, i, obj);
            }
        }
    }

    public final void m(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        e57.p(obj, j, (1 << (i2 >>> 20)) | e57.g(j, obj));
    }

    public final void n(int i, int i2, Object obj) {
        e57.p(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void o(Object obj, l07 l07Var) throws zzjj {
        int i;
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iF = f(i3);
            int i6 = iArr[i3];
            int i7 = (iF >>> 20) & 255;
            Unsafe unsafe = o;
            if (i7 <= 17) {
                int i8 = iArr[i3 + 2];
                int i9 = i8 & i2;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iF & i2;
            switch (i7) {
                case 0:
                    if ((i & i5) != 0) {
                        l07Var.g(e57.e(j, obj), i6);
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        l07Var.k(e57.f(j, obj), i6);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        l07Var.n(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        l07Var.d(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        l07Var.m(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        l07Var.j(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        l07Var.i(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        l07Var.e(i6, e57.s(j, obj));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        s(i6, unsafe.getObject(obj, j), l07Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        l07Var.o(i6, h(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        l07Var.f(i6, (a07) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        l07Var.c(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        l07Var.h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        l07Var.p(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        l07Var.q(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        l07Var.a(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        l07Var.b(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        l07Var.l(i6, h(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    z37.d(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    z37.h(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    z37.k(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    z37.s(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    z37.j(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    z37.g(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    z37.f(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    z37.b(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    z37.q(iArr[i3], (List) unsafe.getObject(obj, j), l07Var);
                    break;
                case 27:
                    z37.l(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, h(i3));
                    break;
                case 28:
                    z37.c(iArr[i3], (List) unsafe.getObject(obj, j), l07Var);
                    break;
                case 29:
                    z37.r(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 30:
                    z37.e(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 31:
                    z37.m(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 32:
                    z37.n(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 33:
                    z37.o(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 34:
                    z37.p(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, false);
                    break;
                case 35:
                    z37.d(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 36:
                    z37.h(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 37:
                    z37.k(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 38:
                    z37.s(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 39:
                    z37.j(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 40:
                    z37.g(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 41:
                    z37.f(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 42:
                    z37.b(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 43:
                    z37.r(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 44:
                    z37.e(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 45:
                    z37.m(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 46:
                    z37.n(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 47:
                    z37.o(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 48:
                    z37.p(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, true);
                    break;
                case 49:
                    z37.i(iArr[i3], (List) unsafe.getObject(obj, j), l07Var, h(i3));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (r(i6, i3, obj)) {
                        l07Var.g(((Double) e57.j(j, obj)).doubleValue(), i6);
                    }
                    break;
                case 52:
                    if (r(i6, i3, obj)) {
                        l07Var.k(((Float) e57.j(j, obj)).floatValue(), i6);
                    }
                    break;
                case 53:
                    if (r(i6, i3, obj)) {
                        l07Var.n(i6, g(j, obj));
                    }
                    break;
                case 54:
                    if (r(i6, i3, obj)) {
                        l07Var.d(i6, g(j, obj));
                    }
                    break;
                case 55:
                    if (r(i6, i3, obj)) {
                        l07Var.m(i6, z(j, obj));
                    }
                    break;
                case 56:
                    if (r(i6, i3, obj)) {
                        l07Var.j(i6, g(j, obj));
                    }
                    break;
                case 57:
                    if (r(i6, i3, obj)) {
                        l07Var.i(i6, z(j, obj));
                    }
                    break;
                case 58:
                    if (r(i6, i3, obj)) {
                        l07Var.e(i6, ((Boolean) e57.j(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i6, i3, obj)) {
                        s(i6, unsafe.getObject(obj, j), l07Var);
                    }
                    break;
                case 60:
                    if (r(i6, i3, obj)) {
                        l07Var.o(i6, h(i3), unsafe.getObject(obj, j));
                    }
                    break;
                case 61:
                    if (r(i6, i3, obj)) {
                        l07Var.f(i6, (a07) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (r(i6, i3, obj)) {
                        l07Var.c(i6, z(j, obj));
                    }
                    break;
                case 63:
                    if (r(i6, i3, obj)) {
                        l07Var.h(i6, z(j, obj));
                    }
                    break;
                case 64:
                    if (r(i6, i3, obj)) {
                        l07Var.p(i6, z(j, obj));
                    }
                    break;
                case 65:
                    if (r(i6, i3, obj)) {
                        l07Var.q(i6, g(j, obj));
                    }
                    break;
                case 66:
                    if (r(i6, i3, obj)) {
                        l07Var.a(i6, z(j, obj));
                    }
                    break;
                case 67:
                    if (r(i6, i3, obj)) {
                        l07Var.b(i6, g(j, obj));
                    }
                    break;
                case 68:
                    if (r(i6, i3, obj)) {
                        l07Var.l(i6, h(i3), unsafe.getObject(obj, j));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        m47 m47Var = this.l;
        m47Var.i(m47Var.c(obj), l07Var);
    }

    public final boolean p(int i, Object obj, Object obj2) {
        return q(i, obj) == q(i, obj2);
    }

    public final boolean q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (e57.g(j, obj) & (1 << (i2 >>> 20))) != 0;
        }
        int iF = f(i);
        long j2 = iF & 1048575;
        switch ((iF >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(e57.e(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(e57.f(j2, obj)) != 0;
            case 2:
                return e57.h(j2, obj) != 0;
            case 3:
                return e57.h(j2, obj) != 0;
            case 4:
                return e57.g(j2, obj) != 0;
            case 5:
                return e57.h(j2, obj) != 0;
            case 6:
                return e57.g(j2, obj) != 0;
            case 7:
                return e57.s(j2, obj);
            case 8:
                Object objJ = e57.j(j2, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof a07) {
                    return !a07.x.equals(objJ);
                }
                throw new IllegalArgumentException();
            case 9:
                return e57.j(j2, obj) != null;
            case 10:
                return !a07.x.equals(e57.j(j2, obj));
            case 11:
                return e57.g(j2, obj) != 0;
            case 12:
                return e57.g(j2, obj) != 0;
            case 13:
                return e57.g(j2, obj) != 0;
            case 14:
                return e57.h(j2, obj) != 0;
            case 15:
                return e57.g(j2, obj) != 0;
            case 16:
                return e57.h(j2, obj) != 0;
            case 17:
                return e57.j(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean r(int i, int i2, Object obj) {
        return e57.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x04b2 A[PHI: r0 r14 r17 r21 r27 r30 r32
  0x04b2: PHI (r0v36 int) = (r0v34 int), (r0v39 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r14v12 com.google.android.gms.internal.measurement.kK<T>) = (r14v10 com.google.android.gms.internal.measurement.kK<T>), (r14v15 com.google.android.gms.internal.measurement.kK<T>) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r17v8 int) = (r17v7 int), (r17v10 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r21v2 int) = (r21v1 int), (r21v5 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r27v3 int) = (r27v2 int), (r27v5 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r30v2 int) = (r30v1 int), (r30v4 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04b2: PHI (r32v6 sun.misc.Unsafe) = (r32v5 sun.misc.Unsafe), (r32v8 sun.misc.Unsafe) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x04c4 A[PHI: r0 r14 r17 r21 r27 r30 r31 r32
  0x04c4: PHI (r0v37 int) = (r0v34 int), (r0v39 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r14v13 com.google.android.gms.internal.measurement.kK<T>) = (r14v10 com.google.android.gms.internal.measurement.kK<T>), (r14v15 com.google.android.gms.internal.measurement.kK<T>) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r17v9 int) = (r17v7 int), (r17v10 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r21v3 int) = (r21v1 int), (r21v5 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r27v4 int) = (r27v2 int), (r27v5 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r30v3 int) = (r30v1 int), (r30v4 int) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r31v5 int[]) = (r31v4 int[]), (r31v6 int[]) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]
  0x04c4: PHI (r32v7 sun.misc.Unsafe) = (r32v5 sun.misc.Unsafe), (r32v8 sun.misc.Unsafe) binds: [B:140:0x04b0, B:130:0x044f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int t(Object obj, byte[] bArr, int i, int i2, int i3, at6 at6Var) {
        Object[] objArr;
        int[] iArr;
        Unsafe unsafe;
        Object obj2;
        kK<T> kKVar;
        int i4;
        int iE;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        at6 at6Var2;
        at6 at6Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        at6 at6Var4;
        byte[] bArr2;
        int i20;
        int i21;
        int iJ;
        int i22;
        int i23;
        int i24;
        int i25;
        int iM;
        int i26;
        kK<T> kKVar2 = this;
        Object obj3 = obj;
        at6 at6Var5 = at6Var;
        Unsafe unsafe2 = o;
        byte[] bArr3 = bArr;
        int i27 = i;
        int i28 = i3;
        i2 = i2;
        at6 at6Var6 = at6Var5;
        int i29 = -1;
        int i30 = 1048575;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            objArr = kKVar2.b;
            int[] iArr2 = kKVar2.a;
            if (i27 < i2) {
                int iK = i27 + 1;
                int i34 = bArr3[i27];
                if (i34 < 0) {
                    iK = bz6.k(i34, bArr3, iK, at6Var6);
                    i34 = at6Var6.a;
                }
                int i35 = i2;
                int i36 = i34 >>> 3;
                at6 at6Var7 = at6Var6;
                int i37 = i34 & 7;
                int i38 = i34;
                int i39 = kKVar2.d;
                int i40 = i28;
                int i41 = kKVar2.c;
                if (i36 > i29) {
                    iE = (i36 < i41 || i36 > i39) ? -1 : kKVar2.E(i36, i32 / 3);
                    i5 = -1;
                } else {
                    iE = (i36 < i41 || i36 > i39) ? -1 : kKVar2.E(i36, 0);
                    i5 = -1;
                }
                if (iE == i5) {
                    i6 = i30;
                    i7 = i36;
                    objArr = objArr;
                    i8 = iK;
                    iArr = iArr2;
                    unsafe = unsafe2;
                    kKVar = kKVar2;
                    i4 = i38 == true ? 1 : 0;
                    i3 = i40;
                    i9 = 0;
                } else {
                    int i42 = iArr2[iE + 1];
                    int i43 = (i42 >>> 20) & 255;
                    int i44 = i31;
                    long j = i42 & 1048575;
                    if (i43 <= 17) {
                        int i45 = iArr2[iE + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i30) {
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj3, i30, i44);
                            }
                            i19 = i47;
                            i18 = unsafe2.getInt(obj3, i47);
                        } else {
                            i18 = i44;
                            i19 = i30;
                        }
                        switch (i43) {
                            case 0:
                                at6Var4 = at6Var;
                                bArr2 = bArr3;
                                i20 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 1) {
                                    e57.n(obj3, j, Double.longBitsToDouble(bz6.n(iK, bArr2)));
                                    iJ = iK + 8;
                                    i23 = i18 | i46;
                                    i22 = iJ;
                                    i2 = i35;
                                    i17 = i20;
                                    bArr3 = bArr2;
                                    at6Var3 = at6Var4;
                                    i31 = i23;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 1:
                                at6Var4 = at6Var;
                                bArr2 = bArr3;
                                i20 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 5) {
                                    e57.o(obj3, j, Float.intBitsToFloat(bz6.b(bArr2, iK)));
                                    iJ = iK + 4;
                                    i23 = i18 | i46;
                                    i22 = iJ;
                                    i2 = i35;
                                    i17 = i20;
                                    bArr3 = bArr2;
                                    at6Var3 = at6Var4;
                                    i31 = i23;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 2:
                            case 3:
                                at6Var4 = at6Var;
                                byte[] bArr4 = bArr3;
                                i20 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 0) {
                                    int iM2 = bz6.m(bArr4, iK, at6Var4);
                                    unsafe2.putLong(obj, j, at6Var4.b);
                                    i22 = iM2;
                                    i17 = i20;
                                    bArr3 = bArr4;
                                    i31 = i18 | i46;
                                    at6Var3 = at6Var4;
                                    i2 = i35;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 4:
                            case 11:
                                at6Var4 = at6Var;
                                byte[] bArr5 = bArr3;
                                i20 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 0) {
                                    iJ = bz6.j(bArr5, iK, at6Var4);
                                    unsafe2.putInt(obj3, j, at6Var4.a);
                                    bArr2 = bArr5;
                                    i23 = i18 | i46;
                                    i22 = iJ;
                                    i2 = i35;
                                    i17 = i20;
                                    bArr3 = bArr2;
                                    at6Var3 = at6Var4;
                                    i31 = i23;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 5:
                            case 14:
                                at6Var4 = at6Var;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 1) {
                                    byte[] bArr6 = bArr3;
                                    unsafe2.putLong(obj, j, bz6.n(iK, bArr3));
                                    iJ = iK + 8;
                                    at6Var4 = at6Var4;
                                    i20 = iE;
                                    bArr2 = bArr6;
                                    i23 = i18 | i46;
                                    i22 = iJ;
                                    i2 = i35;
                                    i17 = i20;
                                    bArr3 = bArr2;
                                    at6Var3 = at6Var4;
                                    i31 = i23;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i20 = iE;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 6:
                            case 13:
                                at6Var4 = at6Var;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj3, j, bz6.b(bArr3, iK));
                                    i31 = i18 | i46;
                                    at6Var6 = at6Var4;
                                    at6Var3 = at6Var6;
                                    i27 = iK + 4;
                                    i30 = i21;
                                    i2 = i35;
                                    i17 = iE;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i20 = iE;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 7:
                                i24 = i2;
                                at6Var4 = at6Var;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 0) {
                                    i27 = bz6.m(bArr3, iK, at6Var4);
                                    e57.m(obj3, j, at6Var4.b != 0);
                                    i31 = i18 | i46;
                                    i32 = iE;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i30 = i21;
                                    i2 = i35;
                                    i28 = i3;
                                    i33 = i11;
                                    i29 = i36;
                                } else {
                                    i20 = iE;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 8:
                                i24 = i2;
                                at6Var4 = at6Var;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 2) {
                                    i27 = (i42 & 536870912) == 0 ? bz6.g(bArr3, iK, at6Var4) : bz6.h(bArr3, iK, at6Var4);
                                    unsafe2.putObject(obj3, j, at6Var4.c);
                                    i2 = i35;
                                    i31 = i18 | i46;
                                    i32 = iE;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i30 = i21;
                                    i28 = i3;
                                    i33 = i11;
                                    i29 = i36;
                                } else {
                                    i20 = iE;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 9:
                                at6Var4 = at6Var;
                                int i48 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 2) {
                                    iE = i48;
                                    kKVar2 = this;
                                    i24 = i2;
                                    i27 = bz6.d(kKVar2.h(iE), bArr3, iK, i24, at6Var4);
                                    if ((i18 & i46) == 0) {
                                        unsafe2.putObject(obj3, j, at6Var4.c);
                                    } else {
                                        unsafe2.putObject(obj3, j, f27.b(unsafe2.getObject(obj3, j), at6Var4.c));
                                    }
                                    i2 = i24;
                                    i31 = i18 | i46;
                                    i32 = iE;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i30 = i21;
                                    i28 = i3;
                                    i33 = i11;
                                    i29 = i36;
                                } else {
                                    iE = i48;
                                    kKVar2 = this;
                                    i20 = iE;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            case 10:
                                at6Var4 = at6Var;
                                i25 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 2) {
                                    i27 = bz6.a(bArr3, iK, at6Var4);
                                    unsafe2.putObject(obj3, j, at6Var4.c);
                                    iM = i27;
                                    i26 = i18 | i46;
                                    i31 = i26;
                                    i27 = iM;
                                    i28 = i3;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i32 = i25;
                                    i30 = i21;
                                    i29 = i36;
                                    kKVar2 = this;
                                    i33 = i11;
                                }
                                i20 = i25;
                                kKVar2 = this;
                                i3 = i3;
                                i8 = iK;
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i4 = i11;
                                i31 = i18;
                                kKVar = kKVar2;
                                i6 = i21;
                                i7 = i36;
                                i9 = i20;
                                break;
                            case 12:
                                at6Var4 = at6Var;
                                i25 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 0) {
                                    i27 = bz6.j(bArr3, iK, at6Var4);
                                    int i49 = at6Var4.a;
                                    int i50 = i25 / 3;
                                    v17 v17Var = (v17) objArr[i50 + i50 + 1];
                                    if (v17Var == null || v17Var.zza(i49)) {
                                        unsafe2.putInt(obj3, j, i49);
                                        iM = i27;
                                        i26 = i18 | i46;
                                        i31 = i26;
                                        i27 = iM;
                                    } else {
                                        u(obj).c(i11 == true ? 1 : 0, Long.valueOf(i49));
                                        i31 = i18;
                                    }
                                    i28 = i3;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i32 = i25;
                                    i30 = i21;
                                    i29 = i36;
                                    kKVar2 = this;
                                    i33 = i11;
                                }
                                i20 = i25;
                                kKVar2 = this;
                                i3 = i3;
                                i8 = iK;
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i4 = i11;
                                i31 = i18;
                                kKVar = kKVar2;
                                i6 = i21;
                                i7 = i36;
                                i9 = i20;
                                break;
                            case 15:
                                at6Var4 = at6Var;
                                i25 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 0) {
                                    i27 = bz6.j(bArr3, iK, at6Var4);
                                    unsafe2.putInt(obj3, j, c07.a(at6Var4.a));
                                    iM = i27;
                                    i26 = i18 | i46;
                                    i31 = i26;
                                    i27 = iM;
                                    i28 = i3;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i32 = i25;
                                    i30 = i21;
                                    i29 = i36;
                                    kKVar2 = this;
                                    i33 = i11;
                                }
                                i20 = i25;
                                kKVar2 = this;
                                i3 = i3;
                                i8 = iK;
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i4 = i11;
                                i31 = i18;
                                kKVar = kKVar2;
                                i6 = i21;
                                i7 = i36;
                                i9 = i20;
                                break;
                            case 16:
                                if (i37 == 0) {
                                    iM = bz6.m(bArr3, iK, at6Var);
                                    long jB = c07.b(at6Var.b);
                                    i25 = iE;
                                    i21 = i19;
                                    i11 = i38 == true ? 1 : 0;
                                    unsafe2.putLong(obj, j, jB);
                                    i26 = i18 | i46;
                                    bArr3 = bArr3;
                                    at6Var4 = at6Var;
                                    i31 = i26;
                                    i27 = iM;
                                    i28 = i3;
                                    at6Var6 = at6Var4;
                                    at6Var5 = at6Var6;
                                    i32 = i25;
                                    i30 = i21;
                                    i29 = i36;
                                    kKVar2 = this;
                                    i33 = i11;
                                } else {
                                    i21 = i19;
                                    i11 = i38 == true ? 1 : 0;
                                    kKVar2 = this;
                                    i20 = iE;
                                    objArr = objArr;
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                            default:
                                at6Var4 = at6Var;
                                i20 = iE;
                                i21 = i19;
                                i11 = i38 == true ? 1 : 0;
                                if (i37 == 3) {
                                    int i51 = iK;
                                    i17 = i20;
                                    at6Var3 = at6Var4;
                                    int iC = bz6.c(kKVar2.h(i20), bArr, i51, i2, (i36 << 3) | 4, at6Var);
                                    if ((i18 & i46) == 0) {
                                        unsafe2.putObject(obj3, j, at6Var3.c);
                                    } else {
                                        unsafe2.putObject(obj3, j, f27.b(unsafe2.getObject(obj3, j), at6Var3.c));
                                    }
                                    bArr3 = bArr;
                                    i2 = i2;
                                    i22 = iC;
                                    i23 = i18 | i46;
                                    i31 = i23;
                                    i27 = i22;
                                    at6Var6 = at6Var3;
                                    i30 = i21;
                                    i28 = i3;
                                    at6Var5 = at6Var3;
                                    i32 = i17;
                                    i29 = i36;
                                    i33 = i11;
                                } else {
                                    i3 = i3;
                                    i8 = iK;
                                    iArr = iArr2;
                                    unsafe = unsafe2;
                                    i4 = i11;
                                    i31 = i18;
                                    kKVar = kKVar2;
                                    i6 = i21;
                                    i7 = i36;
                                    i9 = i20;
                                }
                                break;
                        }
                    } else {
                        int i52 = iE;
                        objArr = objArr;
                        at6Var3 = at6Var5;
                        i11 = i38 == true ? 1 : 0;
                        if (i43 != 27) {
                            i6 = i30;
                            if (i43 <= 49) {
                                i7 = i36;
                                i14 = i44;
                                int i53 = iK;
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i13 = i11 == true ? 1 : 0;
                                i27 = D(obj, bArr, iK, i2, i11 == true ? 1 : 0, i7, i37, i52, i42, i43, j, at6Var);
                                kKVar = this;
                                i16 = i52;
                                if (i27 != i53) {
                                    obj = obj;
                                    i28 = i3;
                                    at6Var2 = at6Var;
                                    i4 = i13;
                                    i32 = i16;
                                    i30 = i6;
                                    i10 = i7;
                                    i31 = i14;
                                } else {
                                    i8 = i27;
                                    i4 = i13;
                                    i9 = i16;
                                    i31 = i14;
                                }
                                bArr3 = bArr;
                                i33 = i4;
                                at6Var6 = at6Var2;
                                at6Var5 = at6Var6;
                                i29 = i10;
                                kKVar2 = kKVar;
                                unsafe2 = unsafe;
                                obj3 = obj;
                            } else {
                                i7 = i36;
                                i12 = iK;
                                iArr = iArr2;
                                unsafe = unsafe2;
                                i13 = i11 == true ? 1 : 0;
                                i14 = i44;
                                i15 = i52;
                                if (i43 != 50) {
                                    kKVar = this;
                                    i16 = i15;
                                    i27 = B(obj, bArr, i12, i2, i13 == true ? 1 : 0, i7, i37, i42, i43, j, i15, at6Var);
                                    if (i27 != i12) {
                                        obj = obj;
                                        i28 = i3;
                                        at6Var2 = at6Var;
                                        i4 = i13;
                                        i32 = i16;
                                        i30 = i6;
                                        i10 = i7;
                                        i31 = i14;
                                    } else {
                                        i8 = i27;
                                        i4 = i13;
                                        i9 = i16;
                                        i31 = i14;
                                    }
                                    bArr3 = bArr;
                                    i33 = i4;
                                    at6Var6 = at6Var2;
                                    at6Var5 = at6Var6;
                                    i29 = i10;
                                    kKVar2 = kKVar;
                                    unsafe2 = unsafe;
                                    obj3 = obj;
                                } else if (i37 == 2) {
                                    A(obj, i15, j);
                                    throw null;
                                }
                            }
                        } else if (i37 == 2) {
                            d27 d27VarZzd = (d27) unsafe2.getObject(obj3, j);
                            if (!d27VarZzd.zzc()) {
                                int size = d27VarZzd.size();
                                d27VarZzd = d27VarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, d27VarZzd);
                            }
                            int i54 = iK;
                            i17 = i52;
                            i27 = bz6.e(kKVar2.h(i52), i11 == true ? 1 : 0, bArr, i54, i2, d27VarZzd, at6Var);
                            bArr3 = bArr;
                            i2 = i2;
                            at6Var6 = at6Var7;
                            i31 = i44;
                            i30 = i30;
                            i28 = i3;
                            at6Var5 = at6Var3;
                            i32 = i17;
                            i29 = i36;
                            i33 = i11;
                        } else {
                            i6 = i30;
                            i15 = i52;
                            i12 = iK;
                            iArr = iArr2;
                            unsafe = unsafe2;
                            i13 = i11 == true ? 1 : 0;
                            i14 = i44;
                            i7 = i36;
                        }
                        kKVar = this;
                        i8 = i12;
                        i4 = i13;
                        i9 = i15;
                        i31 = i14;
                    }
                }
                if (i4 != i3 || i3 == 0) {
                    if (kKVar.f) {
                        at6Var2 = at6Var;
                        q07 q07Var = (q07) at6Var2.d;
                        if (q07Var != q07.c) {
                            i10 = i7;
                            if (q07Var.a(kKVar.e, i10) != null) {
                                throw null;
                            }
                            i27 = bz6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, i8, i2, u(obj), at6Var);
                            obj = obj;
                        }
                        i28 = i3;
                        i32 = i9;
                        i30 = i6;
                        bArr3 = bArr;
                        i33 = i4;
                        at6Var6 = at6Var2;
                        at6Var5 = at6Var6;
                        i29 = i10;
                        kKVar2 = kKVar;
                        unsafe2 = unsafe;
                        obj3 = obj;
                    } else {
                        at6Var2 = at6Var;
                    }
                    i10 = i7;
                    i27 = bz6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, i8, i2, u(obj), at6Var);
                    i28 = i3;
                    i32 = i9;
                    i30 = i6;
                    bArr3 = bArr;
                    i33 = i4;
                    at6Var6 = at6Var2;
                    at6Var5 = at6Var6;
                    i29 = i10;
                    kKVar2 = kKVar;
                    unsafe2 = unsafe;
                    obj3 = obj;
                } else {
                    obj2 = obj;
                    i27 = i8;
                    i28 = i3;
                    i30 = i6;
                }
            } else {
                objArr = objArr;
                iArr = iArr2;
                unsafe = unsafe2;
                obj2 = obj3;
                kKVar = kKVar2;
                i4 = i33;
            }
        }
        if (i30 != 1048575) {
            unsafe.putInt(obj2, i30, i31);
        }
        for (int i55 = kKVar.i; i55 < kKVar.j; i55++) {
            int i56 = kKVar.h[i55];
            int i57 = iArr[i56];
            Object objJ = e57.j(kKVar.f(i56) & 1048575, obj2);
            if (objJ != null) {
                int i58 = i56 / 3;
                if (((v17) objArr[i58 + i58 + 1]) != null) {
                    throw null;
                }
            }
        }
        if (i28 == 0) {
            if (i27 != i2) {
                throw zzko.c();
            }
        } else if (i27 > i2 || i4 != i28) {
            throw zzko.c();
        }
        return i27;
    }

    public final int x(Object obj) {
        int i;
        int iE;
        int iE2;
        int iE3;
        int iF;
        int iE4;
        int iW;
        int iE5;
        int iE6;
        int iC;
        int iE7;
        int iJ;
        int iD;
        int iY;
        int iE8;
        int i2;
        int iE9;
        int iC2;
        int iE10;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                m47 m47Var = this.l;
                int iA = m47Var.a(m47Var.c(obj)) + i5;
                if (!this.f) {
                    return iA;
                }
                this.m.a(obj);
                throw null;
            }
            int iF2 = f(i4);
            int i8 = iArr[i4];
            int i9 = (iF2 >>> 20) & 255;
            Unsafe unsafe = o;
            if (i9 <= 17) {
                int i10 = iArr[i4 + 2];
                int i11 = i10 & i3;
                i = 1 << (i10 >>> 20);
                if (i11 != i6) {
                    i7 = unsafe.getInt(obj, i11);
                    i6 = i11;
                }
            } else {
                i = 0;
            }
            long j = iF2 & i3;
            switch (i9) {
                case 0:
                    if ((i7 & i) != 0) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 1:
                    if ((i7 & i) != 0) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 2:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f(j2);
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 3:
                    if ((i & i7) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f(j3);
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 4:
                    if ((i & i7) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.w(i12);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 5:
                    if ((i7 & i) != 0) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 6:
                    if ((i7 & i) != 0) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 7:
                    if ((i7 & i) != 0) {
                        iE5 = j07.e(i8 << 3);
                        iJ = iE5 + 1;
                        i5 += iJ;
                    }
                    break;
                case 8:
                    if ((i & i7) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof a07)) {
                            iE4 = j07.e(i8 << 3);
                            iW = j07.x((String) object);
                            iJ = iW + iE4;
                            i5 += iJ;
                        } else {
                            iE6 = j07.e(i8 << 3);
                            iC = ((a07) object).c();
                            iE7 = j07.e(iC);
                            i5 += iE7 + iC + iE6;
                        }
                    }
                    break;
                case 9:
                    if ((i & i7) != 0) {
                        iJ = z37.J(i8, h(i4), unsafe.getObject(obj, j));
                        i5 += iJ;
                    }
                    break;
                case 10:
                    if ((i & i7) != 0) {
                        a07 a07Var = (a07) unsafe.getObject(obj, j);
                        iE6 = j07.e(i8 << 3);
                        iC = a07Var.c();
                        iE7 = j07.e(iC);
                        i5 += iE7 + iC + iE6;
                    }
                    break;
                case 11:
                    if ((i & i7) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.e(i13);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 12:
                    if ((i & i7) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.w(i14);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 13:
                    if ((i7 & i) != 0) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 14:
                    if ((i7 & i) != 0) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 15:
                    if ((i & i7) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.e((i15 >> 31) ^ (i15 + i15));
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 16:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f((j4 >> 63) ^ (j4 + j4));
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 17:
                    if ((i & i7) != 0) {
                        iJ = j07.v(i8, (q37) unsafe.getObject(obj, j), h(i4));
                        i5 += iJ;
                    }
                    break;
                case 18:
                    iJ = z37.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 19:
                    iJ = z37.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 20:
                    iJ = z37.H(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 21:
                    iJ = z37.S(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 22:
                    iJ = z37.F(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 23:
                    iJ = z37.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 24:
                    iJ = z37.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 25:
                    iJ = z37.u(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 26:
                    iJ = z37.P((List) unsafe.getObject(obj, j), i8);
                    i5 += iJ;
                    break;
                case 27:
                    iJ = z37.K(i8, (List) unsafe.getObject(obj, j), h(i4));
                    i5 += iJ;
                    break;
                case 28:
                    iJ = z37.x((List) unsafe.getObject(obj, j), i8);
                    i5 += iJ;
                    break;
                case 29:
                    iJ = z37.Q(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 30:
                    iJ = z37.y(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 31:
                    iJ = z37.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 32:
                    iJ = z37.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 33:
                    iJ = z37.L(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 34:
                    iJ = z37.N(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 35:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 36:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 37:
                    iD = z37.I((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 38:
                    iD = z37.T((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 39:
                    iD = z37.G((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 40:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 41:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 42:
                    iD = z37.w((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 43:
                    iD = z37.R((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 44:
                    iD = z37.z((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 45:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 46:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 47:
                    iD = z37.M((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 48:
                    iD = z37.O((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i8);
                        iE8 = j07.e(iD);
                        i2 = iE8 + iY + iD;
                        i5 += i2;
                    }
                    break;
                case 49:
                    iJ = z37.E(i8, (List) unsafe.getObject(obj, j), h(i4));
                    i5 += iJ;
                    break;
                case 50:
                    l37.a(unsafe.getObject(obj, j), i(i4));
                    break;
                case 51:
                    if (r(i8, i4, obj)) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 52:
                    if (r(i8, i4, obj)) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 53:
                    if (r(i8, i4, obj)) {
                        long jG = g(j, obj);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f(jG);
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 54:
                    if (r(i8, i4, obj)) {
                        long jG2 = g(j, obj);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f(jG2);
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 55:
                    if (r(i8, i4, obj)) {
                        int iZ = z(j, obj);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.w(iZ);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 56:
                    if (r(i8, i4, obj)) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 57:
                    if (r(i8, i4, obj)) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 58:
                    if (r(i8, i4, obj)) {
                        iE5 = j07.e(i8 << 3);
                        iJ = iE5 + 1;
                        i5 += iJ;
                    }
                    break;
                case 59:
                    if (r(i8, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof a07)) {
                            iE4 = j07.e(i8 << 3);
                            iW = j07.x((String) object2);
                            iJ = iW + iE4;
                            i5 += iJ;
                        } else {
                            iE9 = j07.e(i8 << 3);
                            iC2 = ((a07) object2).c();
                            iE10 = j07.e(iC2);
                            i2 = iE10 + iC2 + iE9;
                            i5 += i2;
                        }
                    }
                    break;
                case 60:
                    if (r(i8, i4, obj)) {
                        iJ = z37.J(i8, h(i4), unsafe.getObject(obj, j));
                        i5 += iJ;
                    }
                    break;
                case 61:
                    if (r(i8, i4, obj)) {
                        a07 a07Var2 = (a07) unsafe.getObject(obj, j);
                        iE9 = j07.e(i8 << 3);
                        iC2 = a07Var2.c();
                        iE10 = j07.e(iC2);
                        i2 = iE10 + iC2 + iE9;
                        i5 += i2;
                    }
                    break;
                case 62:
                    if (r(i8, i4, obj)) {
                        int iZ2 = z(j, obj);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.e(iZ2);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 63:
                    if (r(i8, i4, obj)) {
                        int iZ3 = z(j, obj);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.w(iZ3);
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 64:
                    if (r(i8, i4, obj)) {
                        iE2 = j07.e(i8 << 3);
                        iJ = iE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 65:
                    if (r(i8, i4, obj)) {
                        iE = j07.e(i8 << 3);
                        iJ = iE + 8;
                        i5 += iJ;
                    }
                    break;
                case 66:
                    if (r(i8, i4, obj)) {
                        int iZ4 = z(j, obj);
                        iE4 = j07.e(i8 << 3);
                        iW = j07.e((iZ4 >> 31) ^ (iZ4 + iZ4));
                        iJ = iW + iE4;
                        i5 += iJ;
                    }
                    break;
                case 67:
                    if (r(i8, i4, obj)) {
                        long jG3 = g(j, obj);
                        iE3 = j07.e(i8 << 3);
                        iF = j07.f((jG3 >> 63) ^ (jG3 + jG3));
                        iJ = iF + iE3;
                        i5 += iJ;
                    }
                    break;
                case 68:
                    if (r(i8, i4, obj)) {
                        iJ = j07.v(i8, (q37) unsafe.getObject(obj, j), h(i4));
                        i5 += iJ;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
    }

    public final int y(Object obj) {
        int iE;
        int iE2;
        int iE3;
        int iF;
        int iE4;
        int iW;
        int iE5;
        int iE6;
        int iC;
        int iE7;
        int iJ;
        int iE8;
        int iF2;
        int iD;
        int iY;
        int iE9;
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                m47 m47Var = this.l;
                return m47Var.a(m47Var.c(obj)) + i3;
            }
            int iF3 = f(i2);
            int i4 = (iF3 >>> 20) & 255;
            int i5 = iArr[i2];
            long j = iF3 & 1048575;
            if (i4 >= b17.x.zza() && i4 <= b17.y.zza()) {
                int i6 = iArr[i2 + 2];
            }
            Unsafe unsafe = o;
            switch (i4) {
                case 0:
                    if (q(i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 1:
                    if (q(i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 2:
                    if (q(i2, obj)) {
                        long jH = e57.h(j, obj);
                        iE3 = j07.e(i5 << 3);
                        iF = j07.f(jH);
                        iJ = iF + iE3;
                        i3 += iJ;
                    }
                    break;
                case 3:
                    if (q(i2, obj)) {
                        long jH2 = e57.h(j, obj);
                        iE3 = j07.e(i5 << 3);
                        iF = j07.f(jH2);
                        iJ = iF + iE3;
                        i3 += iJ;
                    }
                    break;
                case 4:
                    if (q(i2, obj)) {
                        int iG = e57.g(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.w(iG);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 5:
                    if (q(i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 6:
                    if (q(i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 7:
                    if (q(i2, obj)) {
                        iE5 = j07.e(i5 << 3);
                        iJ = iE5 + 1;
                        i3 += iJ;
                    }
                    break;
                case 8:
                    if (q(i2, obj)) {
                        Object objJ = e57.j(j, obj);
                        if (!(objJ instanceof a07)) {
                            iE4 = j07.e(i5 << 3);
                            iW = j07.x((String) objJ);
                            iJ = iW + iE4;
                            i3 += iJ;
                        } else {
                            iE6 = j07.e(i5 << 3);
                            iC = ((a07) objJ).c();
                            iE7 = j07.e(iC);
                            i = iE7 + iC + iE6;
                            i3 += i;
                        }
                    }
                    break;
                case 9:
                    if (q(i2, obj)) {
                        iJ = z37.J(i5, h(i2), e57.j(j, obj));
                        i3 += iJ;
                    }
                    break;
                case 10:
                    if (q(i2, obj)) {
                        a07 a07Var = (a07) e57.j(j, obj);
                        iE6 = j07.e(i5 << 3);
                        iC = a07Var.c();
                        iE7 = j07.e(iC);
                        i = iE7 + iC + iE6;
                        i3 += i;
                    }
                    break;
                case 11:
                    if (q(i2, obj)) {
                        int iG2 = e57.g(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.e(iG2);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 12:
                    if (q(i2, obj)) {
                        int iG3 = e57.g(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.w(iG3);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 13:
                    if (q(i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 14:
                    if (q(i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 15:
                    if (q(i2, obj)) {
                        int iG4 = e57.g(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.e((iG4 >> 31) ^ (iG4 + iG4));
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 16:
                    if (q(i2, obj)) {
                        long jH3 = e57.h(j, obj);
                        iE8 = j07.e(i5 << 3);
                        iF2 = j07.f((jH3 >> 63) ^ (jH3 + jH3));
                        iJ = iF2 + iE8;
                        i3 += iJ;
                    }
                    break;
                case 17:
                    if (q(i2, obj)) {
                        iJ = j07.v(i5, (q37) e57.j(j, obj), h(i2));
                        i3 += iJ;
                    }
                    break;
                case 18:
                    iJ = z37.C(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 19:
                    iJ = z37.A(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 20:
                    iJ = z37.H(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 21:
                    iJ = z37.S(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 22:
                    iJ = z37.F(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 23:
                    iJ = z37.C(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 24:
                    iJ = z37.A(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 25:
                    iJ = z37.u(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 26:
                    iJ = z37.P((List) e57.j(j, obj), i5);
                    i3 += iJ;
                    break;
                case 27:
                    iJ = z37.K(i5, (List) e57.j(j, obj), h(i2));
                    i3 += iJ;
                    break;
                case 28:
                    iJ = z37.x((List) e57.j(j, obj), i5);
                    i3 += iJ;
                    break;
                case 29:
                    iJ = z37.Q(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 30:
                    iJ = z37.y(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 31:
                    iJ = z37.A(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 32:
                    iJ = z37.C(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 33:
                    iJ = z37.L(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 34:
                    iJ = z37.N(i5, (List) e57.j(j, obj));
                    i3 += iJ;
                    break;
                case 35:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 36:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 37:
                    iD = z37.I((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 38:
                    iD = z37.T((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 39:
                    iD = z37.G((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 40:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 41:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 42:
                    iD = z37.w((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 43:
                    iD = z37.R((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 44:
                    iD = z37.z((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 45:
                    iD = z37.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 46:
                    iD = z37.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 47:
                    iD = z37.M((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 48:
                    iD = z37.O((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iY = j07.y(i5);
                        iE9 = j07.e(iD);
                        i = iE9 + iY + iD;
                        i3 += i;
                    }
                    break;
                case 49:
                    iJ = z37.E(i5, (List) e57.j(j, obj), h(i2));
                    i3 += iJ;
                    break;
                case 50:
                    l37.a(e57.j(j, obj), i(i2));
                    break;
                case 51:
                    if (r(i5, i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 52:
                    if (r(i5, i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 53:
                    if (r(i5, i2, obj)) {
                        long jG = g(j, obj);
                        iE3 = j07.e(i5 << 3);
                        iF = j07.f(jG);
                        iJ = iF + iE3;
                        i3 += iJ;
                    }
                    break;
                case 54:
                    if (r(i5, i2, obj)) {
                        long jG2 = g(j, obj);
                        iE3 = j07.e(i5 << 3);
                        iF = j07.f(jG2);
                        iJ = iF + iE3;
                        i3 += iJ;
                    }
                    break;
                case 55:
                    if (r(i5, i2, obj)) {
                        int iZ = z(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.w(iZ);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 56:
                    if (r(i5, i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 57:
                    if (r(i5, i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 58:
                    if (r(i5, i2, obj)) {
                        iE5 = j07.e(i5 << 3);
                        iJ = iE5 + 1;
                        i3 += iJ;
                    }
                    break;
                case 59:
                    if (r(i5, i2, obj)) {
                        Object objJ2 = e57.j(j, obj);
                        if (!(objJ2 instanceof a07)) {
                            iE4 = j07.e(i5 << 3);
                            iW = j07.x((String) objJ2);
                            iJ = iW + iE4;
                            i3 += iJ;
                        } else {
                            iE6 = j07.e(i5 << 3);
                            iC = ((a07) objJ2).c();
                            iE7 = j07.e(iC);
                            i = iE7 + iC + iE6;
                            i3 += i;
                        }
                    }
                    break;
                case 60:
                    if (r(i5, i2, obj)) {
                        iJ = z37.J(i5, h(i2), e57.j(j, obj));
                        i3 += iJ;
                    }
                    break;
                case 61:
                    if (r(i5, i2, obj)) {
                        a07 a07Var2 = (a07) e57.j(j, obj);
                        iE6 = j07.e(i5 << 3);
                        iC = a07Var2.c();
                        iE7 = j07.e(iC);
                        i = iE7 + iC + iE6;
                        i3 += i;
                    }
                    break;
                case 62:
                    if (r(i5, i2, obj)) {
                        int iZ2 = z(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.e(iZ2);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 63:
                    if (r(i5, i2, obj)) {
                        int iZ3 = z(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.w(iZ3);
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 64:
                    if (r(i5, i2, obj)) {
                        iE2 = j07.e(i5 << 3);
                        iJ = iE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 65:
                    if (r(i5, i2, obj)) {
                        iE = j07.e(i5 << 3);
                        iJ = iE + 8;
                        i3 += iJ;
                    }
                    break;
                case 66:
                    if (r(i5, i2, obj)) {
                        int iZ4 = z(j, obj);
                        iE4 = j07.e(i5 << 3);
                        iW = j07.e((iZ4 >> 31) ^ (iZ4 + iZ4));
                        iJ = iW + iE4;
                        i3 += iJ;
                    }
                    break;
                case 67:
                    if (r(i5, i2, obj)) {
                        long jG3 = g(j, obj);
                        iE8 = j07.e(i5 << 3);
                        iF2 = j07.f((jG3 >> 63) ^ (jG3 + jG3));
                        iJ = iF2 + iE8;
                        i3 += iJ;
                    }
                    break;
                case 68:
                    if (r(i5, i2, obj)) {
                        iJ = j07.v(i5, (q37) e57.j(j, obj), h(i2));
                        i3 += iJ;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    @Override // defpackage.y37
    public final int zza(Object obj) {
        return this.g ? y(obj) : x(obj);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4 A[PHI: r3
  0x01f4: PHI (r3v31 int) = (r3v10 int), (r3v32 int) binds: [B:82:0x01f1, B:40:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.y37
    public final int zzb(Object obj) {
        int i;
        int iA;
        int iHashCode;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iF = f(i3);
            int i4 = iArr[i3];
            long j = 1048575 & iF;
            int i5 = 1231;
            switch ((iF >>> 20) & 255) {
                case 0:
                    i = i2 * 53;
                    iA = f27.a(Double.doubleToLongBits(e57.e(j, obj)));
                    i2 = iA + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iA = Float.floatToIntBits(e57.f(j, obj));
                    i2 = iA + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iA = f27.a(e57.h(j, obj));
                    i2 = iA + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iA = f27.a(e57.h(j, obj));
                    i2 = iA + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iA = f27.a(e57.h(j, obj));
                    i2 = iA + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 7:
                    i = i2 * 53;
                    boolean zS = e57.s(j, obj);
                    Charset charset = f27.a;
                    if (!zS) {
                        i5 = 1237;
                    }
                    iA = i5;
                    i2 = iA + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iA = ((String) e57.j(j, obj)).hashCode();
                    i2 = iA + i;
                    break;
                case 9:
                    Object objJ = e57.j(j, obj);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iA = e57.j(j, obj).hashCode();
                    i2 = iA + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iA = f27.a(e57.h(j, obj));
                    i2 = iA + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iA = e57.g(j, obj);
                    i2 = iA + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iA = f27.a(e57.h(j, obj));
                    i2 = iA + i;
                    break;
                case 17:
                    Object objJ2 = e57.j(j, obj);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iA = e57.j(j, obj).hashCode();
                    i2 = iA + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iA = e57.j(j, obj).hashCode();
                    i2 = iA + i;
                    break;
                case 51:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(Double.doubleToLongBits(((Double) e57.j(j, obj)).doubleValue()));
                        i2 = iA + i;
                    }
                    break;
                case 52:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = Float.floatToIntBits(((Float) e57.j(j, obj)).floatValue());
                        i2 = iA + i;
                    }
                    break;
                case 53:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(g(j, obj));
                        i2 = iA + i;
                    }
                    break;
                case 54:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(g(j, obj));
                        i2 = iA + i;
                    }
                    break;
                case 55:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 56:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(g(j, obj));
                        i2 = iA + i;
                    }
                    break;
                case 57:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 58:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        boolean zBooleanValue = ((Boolean) e57.j(j, obj)).booleanValue();
                        Charset charset2 = f27.a;
                        if (!zBooleanValue) {
                            i5 = 1237;
                        }
                        iA = i5;
                        i2 = iA + i;
                    }
                    break;
                case 59:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = ((String) e57.j(j, obj)).hashCode();
                        i2 = iA + i;
                    }
                    break;
                case 60:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = e57.j(j, obj).hashCode();
                        i2 = iA + i;
                    }
                    break;
                case 61:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = e57.j(j, obj).hashCode();
                        i2 = iA + i;
                    }
                    break;
                case 62:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 63:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 64:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 65:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(g(j, obj));
                        i2 = iA + i;
                    }
                    break;
                case 66:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = z(j, obj);
                        i2 = iA + i;
                    }
                    break;
                case 67:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = f27.a(g(j, obj));
                        i2 = iA + i;
                    }
                    break;
                case 68:
                    if (r(i4, i3, obj)) {
                        i = i2 * 53;
                        iA = e57.j(j, obj).hashCode();
                        i2 = iA + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.l.c(obj).hashCode() + (i2 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        this.m.a(obj);
        throw null;
    }

    @Override // defpackage.y37
    public final Object zze() {
        return ((vDR) this.e).q(4);
    }

    @Override // defpackage.y37
    public final void zzf(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jF = f(iArr[i2]) & 1048575;
            Object objJ = e57.j(jF, obj);
            if (objJ != null) {
                ((j37) objJ).w = false;
                e57.q(jF, obj, objJ);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.a(iArr[i], obj);
            i++;
        }
        this.l.g(obj);
        if (this.f) {
            this.m.b(obj);
        }
    }
}
