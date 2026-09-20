package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import defpackage.at6;
import defpackage.bt6;
import defpackage.ct6;
import defpackage.du6;
import defpackage.eu6;
import defpackage.hv6;
import defpackage.iu6;
import defpackage.ku6;
import defpackage.lt6;
import defpackage.nv6;
import defpackage.ot6;
import defpackage.pt6;
import defpackage.pu6;
import defpackage.ru6;
import defpackage.rv6;
import defpackage.st6;
import defpackage.ut6;
import defpackage.vt6;
import defpackage.wu6;
import defpackage.xu6;
import defpackage.yt6;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class com5Fixed<T> implements wu6<T> {
    public static final int[] o = new int[0];
    public static final Unsafe p = nv6.m();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzgpx e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final du6 l;
    public final hv6 m;
    public final st6 n;

    public com5Fixed(int[] iArr, Object[] objArr, int i, int i2, zzgpx zzgpxVar, boolean z, int[] iArr2, int i3, int i4, du6 du6Var, hv6 hv6Var, st6 st6Var, iu6 iu6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzgpxVar instanceof zzgon;
        this.h = z;
        this.f = st6Var != null && st6Var.h(zzgpxVar);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = du6Var;
        this.m = hv6Var;
        this.n = st6Var;
        this.e = zzgpxVar;
    }

    public static com5Fixed A(ku6 ku6Var, du6 du6Var, hv6 hv6Var, st6 st6Var, iu6 iu6Var) {
        if (ku6Var instanceof ru6) {
            return B((ru6) ku6Var, du6Var, hv6Var, st6Var, iu6Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:127:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x027d  */
    public static com5Fixed B(ru6 ru6Var, du6 du6Var, hv6 hv6Var, st6 st6Var, iu6 iu6Var) {
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
        Field fieldN;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldN2;
        int i25;
        Object obj2;
        Field fieldN3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = ru6Var.zzc() == 2;
        String strA = ru6Var.a();
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
            iArr = o;
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
        Object[] objArrB = ru6Var.b();
        Class<?> cls = ru6Var.zza().getClass();
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
            Unsafe unsafe = p;
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
                        fieldN2 = (Field) obj;
                    } else {
                        fieldN2 = n(cls, (String) obj);
                        objArrB[i24] = fieldN2;
                    }
                    int i83 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                    i25 = i24 + 1;
                    obj2 = objArrB[i25];
                    if (obj2 instanceof Field) {
                        fieldN3 = (Field) obj2;
                    } else {
                        fieldN3 = n(cls, (String) obj2);
                        objArrB[i25] = fieldN3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
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
                    fieldN2 = (Field) obj;
                } else {
                    fieldN2 = n(cls, (String) obj);
                    objArrB[i24] = fieldN2;
                }
                int i84 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN2);
                i25 = i24 + 1;
                obj2 = objArrB[i25];
                if (obj2 instanceof Field) {
                    fieldN3 = (Field) obj2;
                } else {
                    fieldN3 = n(cls, (String) obj2);
                    objArrB[i25] = fieldN3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
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
                Field fieldN4 = n(cls, (String) objArrB[i2]);
                i18 = i85;
                if (i72 == 9 || i72 == 17) {
                    int i87 = i63 / 3;
                    objArr[i87 + i87 + 1] = fieldN4.getType();
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
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
                        fieldN = (Field) obj3;
                    } else {
                        fieldN = n(cls, (String) obj3);
                        objArrB[i97] = fieldN;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
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
        return new com5Fixed(iArr2, objArr, iCharAt, iCharAt2, ru6Var.zza(), z, iArr, i5, i59, du6Var, hv6Var, st6Var, iu6Var);
    }

    public static int E(long j, Object obj) {
        return ((Integer) nv6.l(j, obj)).intValue();
    }

    public static long i(long j, Object obj) {
        return ((Long) nv6.l(j, obj)).longValue();
    }

    public static Field n(Class cls, String str) {
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

    public static final void x(int i, Object obj, ot6 ot6Var) {
        if (!(obj instanceof String)) {
            ot6Var.f(i, (zzgnf) obj);
        } else {
            ot6Var.a.zzo(i, (String) obj);
        }
    }

    public static zzgri z(Object obj) {
        zzgon zzgonVar = (zzgon) obj;
        zzgri zzgriVar = zzgonVar.zzc;
        if (zzgriVar != zzgri.zzc()) {
            return zzgriVar;
        }
        zzgri zzgriVarA = zzgri.a();
        zzgonVar.zzc = zzgriVarA;
        return zzgriVarA;
    }

    public final int C(Object obj) {
        int i;
        int iZzE;
        int iZzE2;
        int iZzE3;
        int iZzF;
        int iZzE4;
        int iZzy;
        int iZzE5;
        int iZzE6;
        int iZzd;
        int iZzE7;
        int iJ;
        int iD;
        int iZzD;
        int iZzE8;
        int i2;
        int iZzE9;
        int iZzd2;
        int iZzE10;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                hv6 hv6Var = this.m;
                int iA = hv6Var.a(hv6Var.d(obj)) + i5;
                if (!this.f) {
                    return iA;
                }
                this.n.a(obj);
                throw null;
            }
            int iH = h(i4);
            int i8 = iArr[i4];
            int i9 = (iH >>> 20) & 255;
            Unsafe unsafe = p;
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
            long j = iH & i3;
            switch (i9) {
                case 0:
                    if ((i7 & i) != 0) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 1:
                    if ((i7 & i) != 0) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 2:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF(j2);
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 3:
                    if ((i & i7) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF(j3);
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 4:
                    if ((i & i7) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzy(i12);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 5:
                    if ((i7 & i) != 0) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 6:
                    if ((i7 & i) != 0) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 7:
                    if ((i7 & i) != 0) {
                        iZzE5 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE5 + 1;
                        i5 += iJ;
                    }
                    break;
                case 8:
                    if ((i & i7) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzgnf)) {
                            iZzE4 = zzgnu.zzE(i8 << 3);
                            iZzy = zzgnu.zzC((String) object);
                            iJ = iZzy + iZzE4;
                            i5 += iJ;
                        } else {
                            iZzE6 = zzgnu.zzE(i8 << 3);
                            iZzd = ((zzgnf) object).zzd();
                            iZzE7 = zzgnu.zzE(iZzd);
                            i5 += iZzE7 + iZzd + iZzE6;
                        }
                    }
                    break;
                case 9:
                    if ((i & i7) != 0) {
                        iJ = xu6.J(i8, k(i4), unsafe.getObject(obj, j));
                        i5 += iJ;
                    }
                    break;
                case 10:
                    if ((i & i7) != 0) {
                        zzgnf zzgnfVar = (zzgnf) unsafe.getObject(obj, j);
                        iZzE6 = zzgnu.zzE(i8 << 3);
                        iZzd = zzgnfVar.zzd();
                        iZzE7 = zzgnu.zzE(iZzd);
                        i5 += iZzE7 + iZzd + iZzE6;
                    }
                    break;
                case 11:
                    if ((i & i7) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzE(i13);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 12:
                    if ((i & i7) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzy(i14);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 13:
                    if ((i7 & i) != 0) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 14:
                    if ((i7 & i) != 0) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 15:
                    if ((i & i7) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzE((i15 >> 31) ^ (i15 + i15));
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 16:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF((j4 >> 63) ^ (j4 + j4));
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 17:
                    if ((i & i7) != 0) {
                        iJ = zzgnu.c(i8, (zzgpx) unsafe.getObject(obj, j), k(i4));
                        i5 += iJ;
                    }
                    break;
                case 18:
                    iJ = xu6.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 19:
                    iJ = xu6.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 20:
                    iJ = xu6.H(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 21:
                    iJ = xu6.S(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 22:
                    iJ = xu6.F(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 23:
                    iJ = xu6.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 24:
                    iJ = xu6.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 25:
                    iJ = xu6.t(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 26:
                    iJ = xu6.P((List) unsafe.getObject(obj, j), i8);
                    i5 += iJ;
                    break;
                case 27:
                    iJ = xu6.K(i8, (List) unsafe.getObject(obj, j), k(i4));
                    i5 += iJ;
                    break;
                case 28:
                    iJ = xu6.x((List) unsafe.getObject(obj, j), i8);
                    i5 += iJ;
                    break;
                case 29:
                    iJ = xu6.Q(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 30:
                    iJ = xu6.y(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 31:
                    iJ = xu6.A(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 32:
                    iJ = xu6.C(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 33:
                    iJ = xu6.L(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 34:
                    iJ = xu6.N(i8, (List) unsafe.getObject(obj, j));
                    i5 += iJ;
                    break;
                case 35:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 36:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 37:
                    iD = xu6.I((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 38:
                    iD = xu6.T((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 39:
                    iD = xu6.G((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 40:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 41:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 42:
                    iD = xu6.w((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 43:
                    iD = xu6.R((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 44:
                    iD = xu6.z((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 45:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 46:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 47:
                    iD = xu6.M((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 48:
                    iD = xu6.O((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i8);
                        iZzE8 = zzgnu.zzE(iD);
                        i2 = iZzE8 + iZzD + iD;
                        i5 += i2;
                    }
                    break;
                case 49:
                    iJ = xu6.E(i8, (List) unsafe.getObject(obj, j), k(i4));
                    i5 += iJ;
                    break;
                case 50:
                    iu6.a(unsafe.getObject(obj, j), m(i4));
                    break;
                case 51:
                    if (v(i8, i4, obj)) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 52:
                    if (v(i8, i4, obj)) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 53:
                    if (v(i8, i4, obj)) {
                        long jI = i(j, obj);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF(jI);
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 54:
                    if (v(i8, i4, obj)) {
                        long jI2 = i(j, obj);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF(jI2);
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 55:
                    if (v(i8, i4, obj)) {
                        int iE = E(j, obj);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzy(iE);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 56:
                    if (v(i8, i4, obj)) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 57:
                    if (v(i8, i4, obj)) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 58:
                    if (v(i8, i4, obj)) {
                        iZzE5 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE5 + 1;
                        i5 += iJ;
                    }
                    break;
                case 59:
                    if (v(i8, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzgnf)) {
                            iZzE4 = zzgnu.zzE(i8 << 3);
                            iZzy = zzgnu.zzC((String) object2);
                            iJ = iZzy + iZzE4;
                            i5 += iJ;
                        } else {
                            iZzE9 = zzgnu.zzE(i8 << 3);
                            iZzd2 = ((zzgnf) object2).zzd();
                            iZzE10 = zzgnu.zzE(iZzd2);
                            i2 = iZzE10 + iZzd2 + iZzE9;
                            i5 += i2;
                        }
                    }
                    break;
                case 60:
                    if (v(i8, i4, obj)) {
                        iJ = xu6.J(i8, k(i4), unsafe.getObject(obj, j));
                        i5 += iJ;
                    }
                    break;
                case 61:
                    if (v(i8, i4, obj)) {
                        zzgnf zzgnfVar2 = (zzgnf) unsafe.getObject(obj, j);
                        iZzE9 = zzgnu.zzE(i8 << 3);
                        iZzd2 = zzgnfVar2.zzd();
                        iZzE10 = zzgnu.zzE(iZzd2);
                        i2 = iZzE10 + iZzd2 + iZzE9;
                        i5 += i2;
                    }
                    break;
                case 62:
                    if (v(i8, i4, obj)) {
                        int iE2 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzE(iE2);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 63:
                    if (v(i8, i4, obj)) {
                        int iE3 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzy(iE3);
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 64:
                    if (v(i8, i4, obj)) {
                        iZzE2 = zzgnu.zzE(i8 << 3);
                        iJ = iZzE2 + 4;
                        i5 += iJ;
                    }
                    break;
                case 65:
                    if (v(i8, i4, obj)) {
                        iZzE = zzgnu.zzE(i8 << 3);
                        iJ = iZzE + 8;
                        i5 += iJ;
                    }
                    break;
                case 66:
                    if (v(i8, i4, obj)) {
                        int iE4 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i8 << 3);
                        iZzy = zzgnu.zzE((iE4 >> 31) ^ (iE4 + iE4));
                        iJ = iZzy + iZzE4;
                        i5 += iJ;
                    }
                    break;
                case 67:
                    if (v(i8, i4, obj)) {
                        long jI3 = i(j, obj);
                        iZzE3 = zzgnu.zzE(i8 << 3);
                        iZzF = zzgnu.zzF((jI3 >> 63) ^ (jI3 + jI3));
                        iJ = iZzF + iZzE3;
                        i5 += iJ;
                    }
                    break;
                case 68:
                    if (v(i8, i4, obj)) {
                        iJ = zzgnu.c(i8, (zzgpx) unsafe.getObject(obj, j), k(i4));
                        i5 += iJ;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
    }

    public final int D(Object obj) {
        int iZzE;
        int iZzE2;
        int iZzE3;
        int iZzF;
        int iZzE4;
        int iZzy;
        int iZzE5;
        int iZzE6;
        int iZzd;
        int iZzE7;
        int iJ;
        int iZzE8;
        int iZzF2;
        int iD;
        int iZzD;
        int iZzE9;
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                hv6 hv6Var = this.m;
                return hv6Var.a(hv6Var.d(obj)) + i3;
            }
            int iH = h(i2);
            int i4 = (iH >>> 20) & 255;
            int i5 = iArr[i2];
            long j = iH & 1048575;
            if (i4 >= zzgof.zzJ.zza() && i4 <= zzgof.zzW.zza()) {
                int i6 = iArr[i2 + 2];
            }
            Unsafe unsafe = p;
            switch (i4) {
                case 0:
                    if (u(i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 1:
                    if (u(i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 2:
                    if (u(i2, obj)) {
                        long j2 = nv6.j(j, obj);
                        iZzE3 = zzgnu.zzE(i5 << 3);
                        iZzF = zzgnu.zzF(j2);
                        iJ = iZzF + iZzE3;
                        i3 += iJ;
                    }
                    break;
                case 3:
                    if (u(i2, obj)) {
                        long j3 = nv6.j(j, obj);
                        iZzE3 = zzgnu.zzE(i5 << 3);
                        iZzF = zzgnu.zzF(j3);
                        iJ = iZzF + iZzE3;
                        i3 += iJ;
                    }
                    break;
                case 4:
                    if (u(i2, obj)) {
                        int i7 = nv6.i(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzy(i7);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 5:
                    if (u(i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 6:
                    if (u(i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 7:
                    if (u(i2, obj)) {
                        iZzE5 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE5 + 1;
                        i3 += iJ;
                    }
                    break;
                case 8:
                    if (u(i2, obj)) {
                        Object objL = nv6.l(j, obj);
                        if (!(objL instanceof zzgnf)) {
                            iZzE4 = zzgnu.zzE(i5 << 3);
                            iZzy = zzgnu.zzC((String) objL);
                            iJ = iZzy + iZzE4;
                            i3 += iJ;
                        } else {
                            iZzE6 = zzgnu.zzE(i5 << 3);
                            iZzd = ((zzgnf) objL).zzd();
                            iZzE7 = zzgnu.zzE(iZzd);
                            i = iZzE7 + iZzd + iZzE6;
                            i3 += i;
                        }
                    }
                    break;
                case 9:
                    if (u(i2, obj)) {
                        iJ = xu6.J(i5, k(i2), nv6.l(j, obj));
                        i3 += iJ;
                    }
                    break;
                case 10:
                    if (u(i2, obj)) {
                        zzgnf zzgnfVar = (zzgnf) nv6.l(j, obj);
                        iZzE6 = zzgnu.zzE(i5 << 3);
                        iZzd = zzgnfVar.zzd();
                        iZzE7 = zzgnu.zzE(iZzd);
                        i = iZzE7 + iZzd + iZzE6;
                        i3 += i;
                    }
                    break;
                case 11:
                    if (u(i2, obj)) {
                        int i8 = nv6.i(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzE(i8);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 12:
                    if (u(i2, obj)) {
                        int i9 = nv6.i(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzy(i9);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 13:
                    if (u(i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 14:
                    if (u(i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 15:
                    if (u(i2, obj)) {
                        int i10 = nv6.i(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzE((i10 >> 31) ^ (i10 + i10));
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 16:
                    if (u(i2, obj)) {
                        long j4 = nv6.j(j, obj);
                        iZzE8 = zzgnu.zzE(i5 << 3);
                        iZzF2 = zzgnu.zzF((j4 >> 63) ^ (j4 + j4));
                        iJ = iZzF2 + iZzE8;
                        i3 += iJ;
                    }
                    break;
                case 17:
                    if (u(i2, obj)) {
                        iJ = zzgnu.c(i5, (zzgpx) nv6.l(j, obj), k(i2));
                        i3 += iJ;
                    }
                    break;
                case 18:
                    iJ = xu6.C(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 19:
                    iJ = xu6.A(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 20:
                    iJ = xu6.H(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 21:
                    iJ = xu6.S(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 22:
                    iJ = xu6.F(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 23:
                    iJ = xu6.C(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 24:
                    iJ = xu6.A(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 25:
                    iJ = xu6.t(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 26:
                    iJ = xu6.P((List) nv6.l(j, obj), i5);
                    i3 += iJ;
                    break;
                case 27:
                    iJ = xu6.K(i5, (List) nv6.l(j, obj), k(i2));
                    i3 += iJ;
                    break;
                case 28:
                    iJ = xu6.x((List) nv6.l(j, obj), i5);
                    i3 += iJ;
                    break;
                case 29:
                    iJ = xu6.Q(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 30:
                    iJ = xu6.y(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 31:
                    iJ = xu6.A(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 32:
                    iJ = xu6.C(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 33:
                    iJ = xu6.L(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 34:
                    iJ = xu6.N(i5, (List) nv6.l(j, obj));
                    i3 += iJ;
                    break;
                case 35:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 36:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 37:
                    iD = xu6.I((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 38:
                    iD = xu6.T((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 39:
                    iD = xu6.G((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 40:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 41:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 42:
                    iD = xu6.w((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 43:
                    iD = xu6.R((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 44:
                    iD = xu6.z((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 45:
                    iD = xu6.B((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 46:
                    iD = xu6.D((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 47:
                    iD = xu6.M((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 48:
                    iD = xu6.O((List) unsafe.getObject(obj, j));
                    if (iD > 0) {
                        iZzD = zzgnu.zzD(i5);
                        iZzE9 = zzgnu.zzE(iD);
                        i = iZzE9 + iZzD + iD;
                        i3 += i;
                    }
                    break;
                case 49:
                    iJ = xu6.E(i5, (List) nv6.l(j, obj), k(i2));
                    i3 += iJ;
                    break;
                case 50:
                    iu6.a(nv6.l(j, obj), m(i2));
                    break;
                case 51:
                    if (v(i5, i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 52:
                    if (v(i5, i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 53:
                    if (v(i5, i2, obj)) {
                        long jI = i(j, obj);
                        iZzE3 = zzgnu.zzE(i5 << 3);
                        iZzF = zzgnu.zzF(jI);
                        iJ = iZzF + iZzE3;
                        i3 += iJ;
                    }
                    break;
                case 54:
                    if (v(i5, i2, obj)) {
                        long jI2 = i(j, obj);
                        iZzE3 = zzgnu.zzE(i5 << 3);
                        iZzF = zzgnu.zzF(jI2);
                        iJ = iZzF + iZzE3;
                        i3 += iJ;
                    }
                    break;
                case 55:
                    if (v(i5, i2, obj)) {
                        int iE = E(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzy(iE);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 56:
                    if (v(i5, i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 57:
                    if (v(i5, i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 58:
                    if (v(i5, i2, obj)) {
                        iZzE5 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE5 + 1;
                        i3 += iJ;
                    }
                    break;
                case 59:
                    if (v(i5, i2, obj)) {
                        Object objL2 = nv6.l(j, obj);
                        if (!(objL2 instanceof zzgnf)) {
                            iZzE4 = zzgnu.zzE(i5 << 3);
                            iZzy = zzgnu.zzC((String) objL2);
                            iJ = iZzy + iZzE4;
                            i3 += iJ;
                        } else {
                            iZzE6 = zzgnu.zzE(i5 << 3);
                            iZzd = ((zzgnf) objL2).zzd();
                            iZzE7 = zzgnu.zzE(iZzd);
                            i = iZzE7 + iZzd + iZzE6;
                            i3 += i;
                        }
                    }
                    break;
                case 60:
                    if (v(i5, i2, obj)) {
                        iJ = xu6.J(i5, k(i2), nv6.l(j, obj));
                        i3 += iJ;
                    }
                    break;
                case 61:
                    if (v(i5, i2, obj)) {
                        zzgnf zzgnfVar2 = (zzgnf) nv6.l(j, obj);
                        iZzE6 = zzgnu.zzE(i5 << 3);
                        iZzd = zzgnfVar2.zzd();
                        iZzE7 = zzgnu.zzE(iZzd);
                        i = iZzE7 + iZzd + iZzE6;
                        i3 += i;
                    }
                    break;
                case 62:
                    if (v(i5, i2, obj)) {
                        int iE2 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzE(iE2);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 63:
                    if (v(i5, i2, obj)) {
                        int iE3 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzy(iE3);
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 64:
                    if (v(i5, i2, obj)) {
                        iZzE2 = zzgnu.zzE(i5 << 3);
                        iJ = iZzE2 + 4;
                        i3 += iJ;
                    }
                    break;
                case 65:
                    if (v(i5, i2, obj)) {
                        iZzE = zzgnu.zzE(i5 << 3);
                        iJ = iZzE + 8;
                        i3 += iJ;
                    }
                    break;
                case 66:
                    if (v(i5, i2, obj)) {
                        int iE4 = E(j, obj);
                        iZzE4 = zzgnu.zzE(i5 << 3);
                        iZzy = zzgnu.zzE((iE4 >> 31) ^ (iE4 + iE4));
                        iJ = iZzy + iZzE4;
                        i3 += iJ;
                    }
                    break;
                case 67:
                    if (v(i5, i2, obj)) {
                        long jI3 = i(j, obj);
                        iZzE8 = zzgnu.zzE(i5 << 3);
                        iZzF2 = zzgnu.zzF((jI3 >> 63) ^ (jI3 + jI3));
                        iJ = iZzF2 + iZzE8;
                        i3 += iJ;
                    }
                    break;
                case 68:
                    if (v(i5, i2, obj)) {
                        iJ = zzgnu.c(i5, (zzgpx) nv6.l(j, obj), k(i2));
                        i3 += iJ;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    public final void F(Object obj, int i, long j) {
        Object objM = m(i);
        Unsafe unsafe = p;
        Object object = unsafe.getObject(obj, j);
        if (iu6.b(object)) {
            zzgpr zzgprVarZzb = zzgpr.zza().zzb();
            iu6.c(zzgprVarZzb, object);
            unsafe.putObject(obj, j, zzgprVarZzb);
        }
        throw null;
    }

    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, at6 at6Var) throws zzgoz {
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = p;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(bt6.n(i, bArr))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(bt6.b(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM = bt6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Long.valueOf(at6Var.b));
                unsafe.putInt(obj, j2, i4);
                return iM;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iJ = bt6.j(bArr, i, at6Var);
                unsafe.putObject(obj, j, Integer.valueOf(at6Var.a));
                unsafe.putInt(obj, j2, i4);
                return iJ;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(bt6.n(i, bArr)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(bt6.b(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM2 = bt6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Boolean.valueOf(at6Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iJ2 = bt6.j(bArr, i, at6Var);
                int i9 = at6Var.a;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !rv6.d(bArr, iJ2, iJ2 + i9)) {
                        throw zzgoz.b();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iJ2, i9, zzgox.a));
                    iJ2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iJ2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iD = bt6.d(k(i8), bArr, i, i2, at6Var);
                Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, at6Var.c);
                } else {
                    unsafe.putObject(obj, j, zzgox.a(object, at6Var.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iD;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iA = bt6.a(bArr, i, at6Var);
                unsafe.putObject(obj, j, at6Var.c);
                unsafe.putInt(obj, j2, i4);
                return iA;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iJ3 = bt6.j(bArr, i, at6Var);
                int i10 = at6Var.a;
                zzgor zzgorVarJ = j(i8);
                if (zzgorVarJ == null || zzgorVarJ.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    z(obj).b(i3, Long.valueOf(i10));
                }
                return iJ3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iJ4 = bt6.j(bArr, i, at6Var);
                unsafe.putObject(obj, j, Integer.valueOf(zzgnn.zzF(at6Var.a)));
                unsafe.putInt(obj, j2, i4);
                return iJ4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM3 = bt6.m(bArr, i, at6Var);
                unsafe.putObject(obj, j, Long.valueOf(zzgnn.zzG(at6Var.b)));
                unsafe.putInt(obj, j2, i4);
                return iM3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iC = bt6.c(k(i8), bArr, i, i2, (i3 & (-8)) | 4, at6Var);
                Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, at6Var.c);
                } else {
                    unsafe.putObject(obj, j, zzgox.a(object2, at6Var.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iC;
            default:
                return i;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x009f. Please report as an issue. */
    public final void H(Object obj, byte[] bArr, int i, int i2, at6 at6Var) throws zzgoz {
        int i3;
        int i4;
        int iG;
        int iG2;
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
        com5Fixed<T> com5Var;
        int i16;
        int i17;
        int i18;
        int iM;
        int iJ;
        Object obj3 = obj;
        Unsafe unsafe2 = p;
        com5Fixed<T> com5Var2 = this;
        byte[] bArr2 = bArr;
        int iG3 = i;
        int i19 = i2;
        Object obj4 = obj3;
        int i20 = -1;
        int i21 = 0;
        int i22 = 1048575;
        int i23 = 0;
        while (iG3 < i19) {
            int i24 = iG3 + 1;
            byte b = bArr2[iG3];
            if (b < 0) {
                int iK = bt6.k(b, bArr2, i24, at6Var);
                i3 = at6Var.a;
                i24 = iK;
            } else {
                i3 = b;
            }
            int i25 = i3 >>> 3;
            int i26 = i3 & 7;
            int i27 = com5Var2.d;
            int i28 = com5Var2.c;
            if (i25 > i20) {
                iG2 = (i25 < i28 || i25 > i27) ? -1 : com5Var2.g(i25, i21 / 3);
                i5 = -1;
                i4 = 0;
            } else {
                if (i25 < i28 || i25 > i27) {
                    i4 = 0;
                    iG = -1;
                } else {
                    i4 = 0;
                    iG = com5Var2.g(i25, 0);
                }
                iG2 = iG;
                i5 = -1;
            }
            if (iG2 == i5) {
                i7 = i25;
                i15 = i24;
                unsafe = unsafe2;
            } else {
                int[] iArr = com5Var2.a;
                int i29 = iArr[iG2 + 1];
                int i30 = (i29 >>> 20) & 255;
                long j = i29 & 1048575;
                if (i30 <= 17) {
                    int i31 = iArr[iG2 + 2];
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
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 1) {
                                nv6.q(obj2, j, Double.longBitsToDouble(bt6.n(i16, bArr2)));
                                i18 = i16 + 8;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 1:
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 5) {
                                nv6.r(obj2, j, Float.intBitsToFloat(bt6.b(bArr2, i16)));
                                i18 = i16 + 4;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 2:
                        case 3:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iM = bt6.m(bArr2, i16, at6Var);
                                unsafe2.putLong(obj, j, at6Var.b);
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 4:
                        case 11:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bt6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, at6Var.a);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 5:
                        case 14:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 1) {
                                unsafe2.putLong(obj, j, bt6.n(i16, bArr2));
                                i18 = i16 + 8;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i16 = i16;
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 6:
                        case 13:
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 5) {
                                unsafe2.putInt(obj2, j, bt6.b(bArr2, i16));
                                i18 = i16 + 4;
                                iM = i18;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i16 = i16;
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 7:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bt6.m(bArr2, i16, at6Var);
                                nv6.o(obj2, j, at6Var.b != 0);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 8:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = (i29 & 536870912) == 0 ? bt6.g(bArr2, i16, at6Var) : bt6.h(bArr2, i16, at6Var);
                                unsafe2.putObject(obj2, j, at6Var.c);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 9:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = bt6.d(com5Var2.k(iG2), bArr2, i16, i19, at6Var);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, at6Var.c);
                                } else {
                                    unsafe2.putObject(obj2, j, zzgox.a(object, at6Var.c));
                                }
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 10:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 2) {
                                iJ = bt6.a(bArr2, i16, at6Var);
                                unsafe2.putObject(obj2, j, at6Var.c);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 12:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bt6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, at6Var.a);
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 15:
                            com5Var2 = com5Var2;
                            i16 = i24;
                            i7 = i25;
                            i17 = i22;
                            obj2 = obj4;
                            if (i26 == 0) {
                                iJ = bt6.j(bArr2, i16, at6Var);
                                unsafe2.putInt(obj2, j, zzgnn.zzF(at6Var.a));
                                iM = iJ;
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
                                i22 = i6;
                            }
                            i22 = i17;
                            i15 = i16;
                            unsafe = unsafe2;
                            i4 = iG2;
                            break;
                        case 16:
                            if (i26 == 0) {
                                iM = bt6.m(bArr2, i24, at6Var);
                                i7 = i25;
                                com5Var2 = com5Var2;
                                i17 = i22;
                                obj2 = obj4;
                                unsafe2.putLong(obj, j, zzgnn.zzG(at6Var.b));
                                i23 |= i32;
                                i6 = i17;
                                iG3 = iM;
                                com5Var = com5Var2;
                                obj4 = obj2;
                                com5Var2 = com5Var;
                                bArr2 = bArr2;
                                unsafe = unsafe2;
                                i21 = iG2;
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
                            i4 = iG2;
                            break;
                    }
                } else {
                    com5Fixed<T> com5Var3 = com5Var2;
                    i6 = i22;
                    obj2 = obj4;
                    i7 = i25;
                    if (i30 == 27) {
                        if (i26 == 2) {
                            zzgow zzgowVarZzd = (zzgow) unsafe2.getObject(obj2, j);
                            if (!zzgowVarZzd.zzc()) {
                                int size = zzgowVarZzd.size();
                                zzgowVarZzd = zzgowVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzgowVarZzd);
                            }
                            com5Var = com5Var3;
                            iG3 = bt6.e(com5Var3.k(iG2), i3, bArr, i24, i2, zzgowVarZzd, at6Var);
                            obj4 = obj2;
                            com5Var2 = com5Var;
                            bArr2 = bArr2;
                            unsafe = unsafe2;
                            i21 = iG2;
                            i22 = i6;
                        } else {
                            i8 = i24;
                            i9 = i23;
                            unsafe = unsafe2;
                            i10 = iG2;
                            i11 = i6;
                        }
                    } else if (i30 <= 49) {
                        int i35 = i24;
                        i11 = i6;
                        i9 = i23;
                        unsafe = unsafe2;
                        int i36 = iG2;
                        iG3 = I(obj, bArr, i24, i2, i3, i7, i26, iG2, i29, i30, j, at6Var);
                        if (iG3 != i35) {
                            obj3 = obj;
                            i12 = i36;
                            i14 = i12;
                            i23 = i9;
                            i22 = i11;
                            com5Var2 = this;
                            bArr2 = bArr;
                            i19 = i2;
                            i21 = i14;
                            obj4 = obj3;
                        } else {
                            obj3 = obj;
                            i13 = iG3;
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
                        i10 = iG2;
                        i11 = i6;
                        if (i30 != 50) {
                            obj3 = obj;
                            i12 = i10;
                            iG3 = G(obj, bArr, i8, i2, i3, i7, i26, i29, i30, j, i10, at6Var);
                            if (iG3 != i8) {
                                i14 = i12;
                                i23 = i9;
                                i22 = i11;
                            } else {
                                i13 = iG3;
                            }
                            com5Var2 = this;
                            bArr2 = bArr;
                            i19 = i2;
                            i21 = i14;
                            obj4 = obj3;
                        } else if (i26 == 2) {
                            F(obj, i10, j);
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
            iG3 = bt6.i(i3, bArr, i15, i2, z(obj), at6Var);
            i14 = i4;
            com5Var2 = this;
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
        if (iG3 != i2) {
            throw zzgoz.e();
        }
    }

    public final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, at6 at6Var) throws zzgoz {
        int i8;
        int i9;
        int i10;
        int i11;
        int iJ;
        int iJ2 = i;
        Unsafe unsafe = p;
        zzgow zzgowVarZzd = (zzgow) unsafe.getObject(obj, j2);
        if (!zzgowVarZzd.zzc()) {
            int size = zzgowVarZzd.size();
            zzgowVarZzd = zzgowVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgowVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    pt6 pt6Var = (pt6) zzgowVarZzd;
                    int iJ3 = bt6.j(bArr, iJ2, at6Var);
                    int i12 = at6Var.a + iJ3;
                    while (iJ3 < i12) {
                        pt6Var.b(Double.longBitsToDouble(bt6.n(iJ3, bArr)));
                        iJ3 += 8;
                    }
                    if (iJ3 == i12) {
                        return iJ3;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 1) {
                    pt6 pt6Var2 = (pt6) zzgowVarZzd;
                    pt6Var2.b(Double.longBitsToDouble(bt6.n(iJ2, bArr)));
                    while (true) {
                        i8 = iJ2 + 8;
                        if (i8 < i2) {
                            int iJ4 = bt6.j(bArr, i8, at6Var);
                            if (i3 == at6Var.a) {
                                pt6Var2.b(Double.longBitsToDouble(bt6.n(iJ4, bArr)));
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
                    vt6 vt6Var = (vt6) zzgowVarZzd;
                    int iJ5 = bt6.j(bArr, iJ2, at6Var);
                    int i13 = at6Var.a + iJ5;
                    while (iJ5 < i13) {
                        vt6Var.b(Float.intBitsToFloat(bt6.b(bArr, iJ5)));
                        iJ5 += 4;
                    }
                    if (iJ5 == i13) {
                        return iJ5;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 5) {
                    vt6 vt6Var2 = (vt6) zzgowVarZzd;
                    vt6Var2.b(Float.intBitsToFloat(bt6.b(bArr, i)));
                    while (true) {
                        i9 = iJ2 + 4;
                        if (i9 < i2) {
                            int iJ6 = bt6.j(bArr, i9, at6Var);
                            if (i3 == at6Var.a) {
                                vt6Var2.b(Float.intBitsToFloat(bt6.b(bArr, iJ6)));
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
                    eu6 eu6Var = (eu6) zzgowVarZzd;
                    int iJ7 = bt6.j(bArr, iJ2, at6Var);
                    int i14 = at6Var.a + iJ7;
                    while (iJ7 < i14) {
                        iJ7 = bt6.m(bArr, iJ7, at6Var);
                        eu6Var.b(at6Var.b);
                    }
                    if (iJ7 == i14) {
                        return iJ7;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 0) {
                    eu6 eu6Var2 = (eu6) zzgowVarZzd;
                    int iM = bt6.m(bArr, iJ2, at6Var);
                    eu6Var2.b(at6Var.b);
                    while (iM < i2) {
                        int iJ8 = bt6.j(bArr, iM, at6Var);
                        if (i3 != at6Var.a) {
                            return iM;
                        }
                        iM = bt6.m(bArr, iJ8, at6Var);
                        eu6Var2.b(at6Var.b);
                    }
                    return iM;
                }
                return iJ2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return bt6.f(bArr, iJ2, zzgowVarZzd, at6Var);
                }
                if (i5 == 0) {
                    return bt6.l(i3, bArr, i, i2, zzgowVarZzd, at6Var);
                }
                return iJ2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    eu6 eu6Var3 = (eu6) zzgowVarZzd;
                    int iJ9 = bt6.j(bArr, iJ2, at6Var);
                    int i15 = at6Var.a + iJ9;
                    while (iJ9 < i15) {
                        eu6Var3.b(bt6.n(iJ9, bArr));
                        iJ9 += 8;
                    }
                    if (iJ9 == i15) {
                        return iJ9;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 1) {
                    eu6 eu6Var4 = (eu6) zzgowVarZzd;
                    eu6Var4.b(bt6.n(iJ2, bArr));
                    while (true) {
                        i10 = iJ2 + 8;
                        if (i10 < i2) {
                            int iJ10 = bt6.j(bArr, i10, at6Var);
                            if (i3 == at6Var.a) {
                                eu6Var4.b(bt6.n(iJ10, bArr));
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
                    yt6 yt6Var = (yt6) zzgowVarZzd;
                    int iJ11 = bt6.j(bArr, iJ2, at6Var);
                    int i16 = at6Var.a + iJ11;
                    while (iJ11 < i16) {
                        yt6Var.zzh(bt6.b(bArr, iJ11));
                        iJ11 += 4;
                    }
                    if (iJ11 == i16) {
                        return iJ11;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 5) {
                    yt6 yt6Var2 = (yt6) zzgowVarZzd;
                    yt6Var2.zzh(bt6.b(bArr, i));
                    while (true) {
                        i11 = iJ2 + 4;
                        if (i11 < i2) {
                            int iJ12 = bt6.j(bArr, i11, at6Var);
                            if (i3 == at6Var.a) {
                                yt6Var2.zzh(bt6.b(bArr, iJ12));
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
                    ct6 ct6Var = (ct6) zzgowVarZzd;
                    iJ = bt6.j(bArr, iJ2, at6Var);
                    int i17 = at6Var.a + iJ;
                    while (iJ < i17) {
                        iJ = bt6.m(bArr, iJ, at6Var);
                        ct6Var.b(at6Var.b != 0);
                    }
                    if (iJ != i17) {
                        throw zzgoz.f();
                    }
                    return iJ;
                }
                if (i5 == 0) {
                    ct6 ct6Var2 = (ct6) zzgowVarZzd;
                    int iM2 = bt6.m(bArr, iJ2, at6Var);
                    ct6Var2.b(at6Var.b != 0);
                    while (iM2 < i2) {
                        int iJ13 = bt6.j(bArr, iM2, at6Var);
                        if (i3 != at6Var.a) {
                            return iM2;
                        }
                        iM2 = bt6.m(bArr, iJ13, at6Var);
                        ct6Var2.b(at6Var.b != 0);
                    }
                    return iM2;
                }
                return iJ2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iJ2 = bt6.j(bArr, iJ2, at6Var);
                        int i18 = at6Var.a;
                        if (i18 < 0) {
                            throw zzgoz.d();
                        }
                        if (i18 == 0) {
                            zzgowVarZzd.add("");
                        } else {
                            zzgowVarZzd.add(new String(bArr, iJ2, i18, zzgox.a));
                            iJ2 += i18;
                        }
                        while (iJ2 < i2) {
                            int iJ14 = bt6.j(bArr, iJ2, at6Var);
                            if (i3 == at6Var.a) {
                                iJ2 = bt6.j(bArr, iJ14, at6Var);
                                int i19 = at6Var.a;
                                if (i19 < 0) {
                                    throw zzgoz.d();
                                }
                                if (i19 == 0) {
                                    zzgowVarZzd.add("");
                                } else {
                                    zzgowVarZzd.add(new String(bArr, iJ2, i19, zzgox.a));
                                    iJ2 += i19;
                                }
                            }
                        }
                    } else {
                        iJ2 = bt6.j(bArr, iJ2, at6Var);
                        int i20 = at6Var.a;
                        if (i20 < 0) {
                            throw zzgoz.d();
                        }
                        if (i20 == 0) {
                            zzgowVarZzd.add("");
                        } else {
                            int i21 = iJ2 + i20;
                            if (!rv6.d(bArr, iJ2, i21)) {
                                throw zzgoz.b();
                            }
                            zzgowVarZzd.add(new String(bArr, iJ2, i20, zzgox.a));
                            iJ2 = i21;
                        }
                        while (iJ2 < i2) {
                            int iJ15 = bt6.j(bArr, iJ2, at6Var);
                            if (i3 == at6Var.a) {
                                iJ2 = bt6.j(bArr, iJ15, at6Var);
                                int i22 = at6Var.a;
                                if (i22 < 0) {
                                    throw zzgoz.d();
                                }
                                if (i22 == 0) {
                                    zzgowVarZzd.add("");
                                } else {
                                    int i23 = iJ2 + i22;
                                    if (!rv6.d(bArr, iJ2, i23)) {
                                        throw zzgoz.b();
                                    }
                                    zzgowVarZzd.add(new String(bArr, iJ2, i22, zzgox.a));
                                    iJ2 = i23;
                                }
                            }
                        }
                    }
                }
                return iJ2;
            case 27:
                if (i5 == 2) {
                    return bt6.e(k(i6), i3, bArr, i, i2, zzgowVarZzd, at6Var);
                }
                return iJ2;
            case 28:
                if (i5 == 2) {
                    int iJ16 = bt6.j(bArr, iJ2, at6Var);
                    int i24 = at6Var.a;
                    if (i24 < 0) {
                        throw zzgoz.d();
                    }
                    if (i24 > bArr.length - iJ16) {
                        throw zzgoz.f();
                    }
                    if (i24 == 0) {
                        zzgowVarZzd.add(zzgnf.zzb);
                    } else {
                        zzgowVarZzd.add(zzgnf.zzw(bArr, iJ16, i24));
                        iJ16 += i24;
                    }
                    while (iJ16 < i2) {
                        int iJ17 = bt6.j(bArr, iJ16, at6Var);
                        if (i3 != at6Var.a) {
                            return iJ16;
                        }
                        iJ16 = bt6.j(bArr, iJ17, at6Var);
                        int i25 = at6Var.a;
                        if (i25 < 0) {
                            throw zzgoz.d();
                        }
                        if (i25 > bArr.length - iJ16) {
                            throw zzgoz.f();
                        }
                        if (i25 == 0) {
                            zzgowVarZzd.add(zzgnf.zzb);
                        } else {
                            zzgowVarZzd.add(zzgnf.zzw(bArr, iJ16, i25));
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
                        iJ = bt6.l(i3, bArr, i, i2, zzgowVarZzd, at6Var);
                    }
                    return iJ2;
                }
                iJ = bt6.f(bArr, iJ2, zzgowVarZzd, at6Var);
                zzgon zzgonVar = (zzgon) obj;
                zzgri zzgriVar = zzgonVar.zzc;
                if (zzgriVar == zzgri.zzc()) {
                    zzgriVar = null;
                }
                Object objA = xu6.a(i4, zzgowVarZzd, j(i6), zzgriVar, this.m);
                if (objA != null) {
                    zzgonVar.zzc = (zzgri) objA;
                    return iJ;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    yt6 yt6Var3 = (yt6) zzgowVarZzd;
                    int iJ18 = bt6.j(bArr, iJ2, at6Var);
                    int i26 = at6Var.a + iJ18;
                    while (iJ18 < i26) {
                        iJ18 = bt6.j(bArr, iJ18, at6Var);
                        yt6Var3.zzh(zzgnn.zzF(at6Var.a));
                    }
                    if (iJ18 == i26) {
                        return iJ18;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 0) {
                    yt6 yt6Var4 = (yt6) zzgowVarZzd;
                    int iJ19 = bt6.j(bArr, iJ2, at6Var);
                    yt6Var4.zzh(zzgnn.zzF(at6Var.a));
                    while (iJ19 < i2) {
                        int iJ20 = bt6.j(bArr, iJ19, at6Var);
                        if (i3 != at6Var.a) {
                            return iJ19;
                        }
                        iJ19 = bt6.j(bArr, iJ20, at6Var);
                        yt6Var4.zzh(zzgnn.zzF(at6Var.a));
                    }
                    return iJ19;
                }
                return iJ2;
            case 34:
            case 48:
                if (i5 == 2) {
                    eu6 eu6Var5 = (eu6) zzgowVarZzd;
                    int iJ21 = bt6.j(bArr, iJ2, at6Var);
                    int i27 = at6Var.a + iJ21;
                    while (iJ21 < i27) {
                        iJ21 = bt6.m(bArr, iJ21, at6Var);
                        eu6Var5.b(zzgnn.zzG(at6Var.b));
                    }
                    if (iJ21 == i27) {
                        return iJ21;
                    }
                    throw zzgoz.f();
                }
                if (i5 == 0) {
                    eu6 eu6Var6 = (eu6) zzgowVarZzd;
                    int iM3 = bt6.m(bArr, iJ2, at6Var);
                    eu6Var6.b(zzgnn.zzG(at6Var.b));
                    while (iM3 < i2) {
                        int iJ22 = bt6.j(bArr, iM3, at6Var);
                        if (i3 != at6Var.a) {
                            return iM3;
                        }
                        iM3 = bt6.m(bArr, iJ22, at6Var);
                        eu6Var6.b(zzgnn.zzG(at6Var.b));
                    }
                    return iM3;
                }
                return iJ2;
            default:
                if (i5 == 3) {
                    wu6 wu6VarK = k(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iC = bt6.c(wu6VarK, bArr, i, i2, i28, at6Var);
                    zzgowVarZzd.add(at6Var.c);
                    while (iC < i2) {
                        int iJ23 = bt6.j(bArr, iC, at6Var);
                        if (i3 != at6Var.a) {
                            return iC;
                        }
                        iC = bt6.c(wu6VarK, bArr, iJ23, i2, i28, at6Var);
                        zzgowVarZzd.add(at6Var.c);
                    }
                    return iC;
                }
                return iJ2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be A[LOOP:1: B:49:0x00ad->B:54:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[SYNTHETIC] */
    @Override // defpackage.wu6
    public final boolean a(Object obj) {
        List list;
        wu6 wu6VarK;
        int i;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (true) {
            boolean zU = true;
            if (i2 >= this.j) {
                if (!this.f) {
                    return true;
                }
                this.n.a(obj);
                throw null;
            }
            int i5 = this.i[i2];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int iH = h(i5);
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = p.getInt(obj, i8);
                }
                i3 = i8;
            }
            if ((268435456 & iH) != 0) {
                if (!(i3 == 1048575 ? u(i5, obj) : (i4 & i9) != 0)) {
                    return false;
                }
            }
            int i10 = (iH >>> 20) & 255;
            if (i10 == 9 || i10 == 17) {
                if (i3 == 1048575) {
                    zU = u(i5, obj);
                } else if ((i4 & i9) == 0) {
                    zU = false;
                }
                if (zU && !k(i5).a(nv6.l(iH & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) nv6.l(iH & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    wu6VarK = k(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!wu6VarK.a(list.get(i))) {
                            return false;
                        }
                    }
                }
            } else if (i10 == 60 || i10 == 68) {
                if (v(i6, i5, obj) && !k(i5).a(nv6.l(iH & 1048575, obj))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) nv6.l(iH & 1048575, obj);
                if (list.isEmpty()) {
                    wu6VarK = k(i5);
                    while (i < list.size()) {
                        if (!wu6VarK.a(list.get(i))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i10 == 50 && !((zzgpr) nv6.l(iH & 1048575, obj)).isEmpty()) {
                throw null;
            }
            i2++;
        }
    }

    @Override // defpackage.wu6
    public final void b(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Class cls = xu6.a;
                hv6 hv6Var = this.m;
                hv6Var.o(obj, hv6Var.e(hv6Var.d(obj), hv6Var.d(obj2)));
                if (this.f) {
                    this.n.a(obj2);
                    throw null;
                }
                return;
            }
            int iH = h(i);
            long j = 1048575 & iH;
            int i2 = iArr[i];
            switch ((iH >>> 20) & 255) {
                case 0:
                    if (u(i, obj2)) {
                        nv6.q(obj, j, nv6.g(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 1:
                    if (u(i, obj2)) {
                        nv6.r(obj, j, nv6.h(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 2:
                    if (u(i, obj2)) {
                        nv6.t(obj, j, nv6.j(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 3:
                    if (u(i, obj2)) {
                        nv6.t(obj, j, nv6.j(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 4:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 5:
                    if (u(i, obj2)) {
                        nv6.t(obj, j, nv6.j(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 6:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 7:
                    if (u(i, obj2)) {
                        nv6.o(obj, j, nv6.w(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 8:
                    if (u(i, obj2)) {
                        nv6.u(j, obj, nv6.l(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 9:
                    o(i, obj, obj2);
                    break;
                case 10:
                    if (u(i, obj2)) {
                        nv6.u(j, obj, nv6.l(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 11:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 12:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 13:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 14:
                    if (u(i, obj2)) {
                        nv6.t(obj, j, nv6.j(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 15:
                    if (u(i, obj2)) {
                        nv6.s(obj, j, nv6.i(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 16:
                    if (u(i, obj2)) {
                        nv6.t(obj, j, nv6.j(j, obj2));
                        r(i, obj);
                    }
                    break;
                case 17:
                    o(i, obj, obj2);
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
                    this.l.c(j, obj, obj2);
                    break;
                case 50:
                    Class cls2 = xu6.a;
                    nv6.u(j, obj, iu6.c(nv6.l(j, obj), nv6.l(j, obj2)));
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
                    if (v(i2, i, obj2)) {
                        nv6.u(j, obj, nv6.l(j, obj2));
                        s(i2, i, obj);
                    }
                    break;
                case 60:
                    p(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, obj2)) {
                        nv6.u(j, obj, nv6.l(j, obj2));
                        s(i2, i, obj);
                    }
                    break;
                case 68:
                    p(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // defpackage.wu6
    public final boolean c(Object obj, Object obj2) {
        boolean zB;
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iH = h(i);
            long j = iH & 1048575;
            switch ((iH >>> 20) & 255) {
                case 0:
                    if (!t(i, obj, obj2) || Double.doubleToLongBits(nv6.g(j, obj)) != Double.doubleToLongBits(nv6.g(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!t(i, obj, obj2) || Float.floatToIntBits(nv6.h(j, obj)) != Float.floatToIntBits(nv6.h(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!t(i, obj, obj2) || nv6.j(j, obj) != nv6.j(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!t(i, obj, obj2) || nv6.j(j, obj) != nv6.j(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!t(i, obj, obj2) || nv6.j(j, obj) != nv6.j(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!t(i, obj, obj2) || nv6.w(j, obj) != nv6.w(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!t(i, obj, obj2) || !xu6.b(nv6.l(j, obj), nv6.l(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!t(i, obj, obj2) || !xu6.b(nv6.l(j, obj), nv6.l(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!t(i, obj, obj2) || !xu6.b(nv6.l(j, obj), nv6.l(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!t(i, obj, obj2) || nv6.j(j, obj) != nv6.j(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!t(i, obj, obj2) || nv6.i(j, obj) != nv6.i(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!t(i, obj, obj2) || nv6.j(j, obj) != nv6.j(j, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!t(i, obj, obj2) || !xu6.b(nv6.l(j, obj), nv6.l(j, obj2))) {
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
                    zB = xu6.b(nv6.l(j, obj), nv6.l(j, obj2));
                    break;
                case 50:
                    zB = xu6.b(nv6.l(j, obj), nv6.l(j, obj2));
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
                    if (nv6.i(j2, obj) != nv6.i(j2, obj2) || !xu6.b(nv6.l(j, obj), nv6.l(j, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zB) {
                return false;
            }
        }
        hv6 hv6Var = this.m;
        if (!hv6Var.d(obj).equals(hv6Var.d(obj2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        st6 st6Var = this.n;
        st6Var.a(obj);
        st6Var.a(obj2);
        throw null;
    }

    @Override // defpackage.wu6
    public final void d(Object obj, ot6 ot6Var) {
        if (!this.h) {
            w(obj, ot6Var);
            return;
        }
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iH = h(i);
            int i2 = iArr[i];
            switch ((iH >>> 20) & 255) {
                case 0:
                    if (u(i, obj)) {
                        ot6Var.g(nv6.g(iH & 1048575, obj), i2);
                    }
                    break;
                case 1:
                    if (u(i, obj)) {
                        ot6Var.k(nv6.h(iH & 1048575, obj), i2);
                    }
                    break;
                case 2:
                    if (u(i, obj)) {
                        ot6Var.n(i2, nv6.j(iH & 1048575, obj));
                    }
                    break;
                case 3:
                    if (u(i, obj)) {
                        ot6Var.d(i2, nv6.j(iH & 1048575, obj));
                    }
                    break;
                case 4:
                    if (u(i, obj)) {
                        ot6Var.m(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 5:
                    if (u(i, obj)) {
                        ot6Var.j(i2, nv6.j(iH & 1048575, obj));
                    }
                    break;
                case 6:
                    if (u(i, obj)) {
                        ot6Var.i(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 7:
                    if (u(i, obj)) {
                        ot6Var.e(i2, nv6.w(iH & 1048575, obj));
                    }
                    break;
                case 8:
                    if (u(i, obj)) {
                        x(i2, nv6.l(iH & 1048575, obj), ot6Var);
                    }
                    break;
                case 9:
                    if (u(i, obj)) {
                        ot6Var.o(i2, k(i), nv6.l(iH & 1048575, obj));
                    }
                    break;
                case 10:
                    if (u(i, obj)) {
                        ot6Var.f(i2, (zzgnf) nv6.l(iH & 1048575, obj));
                    }
                    break;
                case 11:
                    if (u(i, obj)) {
                        ot6Var.c(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 12:
                    if (u(i, obj)) {
                        ot6Var.h(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 13:
                    if (u(i, obj)) {
                        ot6Var.p(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 14:
                    if (u(i, obj)) {
                        ot6Var.q(i2, nv6.j(iH & 1048575, obj));
                    }
                    break;
                case 15:
                    if (u(i, obj)) {
                        ot6Var.a(i2, nv6.i(iH & 1048575, obj));
                    }
                    break;
                case 16:
                    if (u(i, obj)) {
                        ot6Var.b(i2, nv6.j(iH & 1048575, obj));
                    }
                    break;
                case 17:
                    if (u(i, obj)) {
                        ot6Var.l(i2, k(i), nv6.l(iH & 1048575, obj));
                    }
                    break;
                case 18:
                    xu6.e(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 19:
                    xu6.i(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 20:
                    xu6.l(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 21:
                    xu6.u(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 22:
                    xu6.k(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 23:
                    xu6.h(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 24:
                    xu6.g(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 25:
                    xu6.c(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 26:
                    xu6.r(i2, (List) nv6.l(iH & 1048575, obj), ot6Var);
                    break;
                case 27:
                    xu6.m(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, k(i));
                    break;
                case 28:
                    xu6.d(i2, (List) nv6.l(iH & 1048575, obj), ot6Var);
                    break;
                case 29:
                    xu6.s(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 30:
                    xu6.f(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 31:
                    xu6.n(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 32:
                    xu6.o(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 33:
                    xu6.p(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 34:
                    xu6.q(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, false);
                    break;
                case 35:
                    xu6.e(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 36:
                    xu6.i(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 37:
                    xu6.l(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 38:
                    xu6.u(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 39:
                    xu6.k(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 40:
                    xu6.h(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 41:
                    xu6.g(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 42:
                    xu6.c(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 43:
                    xu6.s(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 44:
                    xu6.f(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 45:
                    xu6.n(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 46:
                    xu6.o(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 47:
                    xu6.p(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 48:
                    xu6.q(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, true);
                    break;
                case 49:
                    xu6.j(i2, (List) nv6.l(iH & 1048575, obj), ot6Var, k(i));
                    break;
                case 50:
                    if (nv6.l(iH & 1048575, obj) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (v(i2, i, obj)) {
                        ot6Var.g(((Double) nv6.l(iH & 1048575, obj)).doubleValue(), i2);
                    }
                    break;
                case 52:
                    if (v(i2, i, obj)) {
                        ot6Var.k(((Float) nv6.l(iH & 1048575, obj)).floatValue(), i2);
                    }
                    break;
                case 53:
                    if (v(i2, i, obj)) {
                        ot6Var.n(i2, i(iH & 1048575, obj));
                    }
                    break;
                case 54:
                    if (v(i2, i, obj)) {
                        ot6Var.d(i2, i(iH & 1048575, obj));
                    }
                    break;
                case 55:
                    if (v(i2, i, obj)) {
                        ot6Var.m(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 56:
                    if (v(i2, i, obj)) {
                        ot6Var.j(i2, i(iH & 1048575, obj));
                    }
                    break;
                case 57:
                    if (v(i2, i, obj)) {
                        ot6Var.i(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 58:
                    if (v(i2, i, obj)) {
                        ot6Var.e(i2, ((Boolean) nv6.l(iH & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (v(i2, i, obj)) {
                        x(i2, nv6.l(iH & 1048575, obj), ot6Var);
                    }
                    break;
                case 60:
                    if (v(i2, i, obj)) {
                        ot6Var.o(i2, k(i), nv6.l(iH & 1048575, obj));
                    }
                    break;
                case 61:
                    if (v(i2, i, obj)) {
                        ot6Var.f(i2, (zzgnf) nv6.l(iH & 1048575, obj));
                    }
                    break;
                case 62:
                    if (v(i2, i, obj)) {
                        ot6Var.c(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 63:
                    if (v(i2, i, obj)) {
                        ot6Var.h(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 64:
                    if (v(i2, i, obj)) {
                        ot6Var.p(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 65:
                    if (v(i2, i, obj)) {
                        ot6Var.q(i2, i(iH & 1048575, obj));
                    }
                    break;
                case 66:
                    if (v(i2, i, obj)) {
                        ot6Var.a(i2, E(iH & 1048575, obj));
                    }
                    break;
                case 67:
                    if (v(i2, i, obj)) {
                        ot6Var.b(i2, i(iH & 1048575, obj));
                    }
                    break;
                case 68:
                    if (v(i2, i, obj)) {
                        ot6Var.l(i2, k(i), nv6.l(iH & 1048575, obj));
                    }
                    break;
            }
        }
        hv6 hv6Var = this.m;
        hv6Var.r(hv6Var.d(obj), ot6Var);
    }

    @Override // defpackage.wu6
    public final void e(Object obj, byte[] bArr, int i, int i2, at6 at6Var) throws zzgoz {
        if (this.h) {
            H(obj, bArr, i, i2, at6Var);
        } else {
            y(obj, bArr, i, i2, 0, at6Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x06cc A[Catch: all -> 0x0511, TryCatch #1 {all -> 0x0511, blocks: (B:45:0x0098, B:172:0x06af, B:180:0x06c7, B:182:0x06cc, B:183:0x06d1, B:136:0x0505, B:142:0x051b, B:143:0x0531, B:144:0x0547, B:145:0x055d, B:147:0x056e, B:150:0x0575, B:152:0x0579, B:154:0x057f, B:155:0x0586, B:156:0x0591, B:157:0x05a7, B:158:0x05b9, B:160:0x05c2, B:161:0x05de, B:162:0x05f5, B:163:0x0600, B:164:0x0616, B:165:0x062c, B:166:0x0642, B:167:0x0658, B:168:0x066e, B:169:0x0684, B:170:0x0699), top: B:202:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x06db A[LOOP:5: B:186:0x06d9->B:187:0x06db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:194:0x06f2 A[LOOP:4: B:193:0x06f0->B:194:0x06f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:212:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.wu6
    public final void f(Object obj, lt6 lt6Var, zzgnz zzgnzVar) throws Throwable {
        int i;
        hv6 hv6Var;
        int i2;
        int i3;
        int[] iArr = this.i;
        int i4 = this.k;
        int i5 = this.j;
        zzgnzVar.getClass();
        hv6 hv6Var2 = this.m;
        Object objA = null;
        ut6 ut6VarB = null;
        while (true) {
            try {
                int iT = lt6Var.t();
                int iG = (iT < this.c || iT > this.d) ? -1 : g(iT, 0);
                if (iG >= 0) {
                    int iH = h(iG);
                    int i6 = (iH >>> 20) & 255;
                    zzgnn zzgnnVar = lt6Var.a;
                    du6 du6Var = this.l;
                    switch (i6) {
                        case 0:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(1);
                            nv6.q(obj, iH & 1048575, zzgnnVar.zzb());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 1:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(5);
                            nv6.r(obj, iH & 1048575, zzgnnVar.zzc());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 2:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.t(obj, iH & 1048575, zzgnnVar.zzp());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 3:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.t(obj, iH & 1048575, zzgnnVar.zzv());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 4:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.s(obj, iH & 1048575, zzgnnVar.zzh());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 5:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(1);
                            nv6.t(obj, iH & 1048575, zzgnnVar.zzo());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 6:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(5);
                            nv6.s(obj, iH & 1048575, zzgnnVar.zzg());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 7:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.o(obj, iH & 1048575, zzgnnVar.zzD());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 8:
                            i = i5;
                            hv6Var = hv6Var2;
                            q(obj, iH, lt6Var);
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 9:
                            i = i5;
                            hv6Var = hv6Var2;
                            if (u(iG, obj)) {
                                long j = iH & 1048575;
                                Object objL = nv6.l(j, obj);
                                wu6 wu6VarK = k(iG);
                                lt6Var.q(2);
                                nv6.u(j, obj, zzgox.a(objL, lt6Var.o(wu6VarK, zzgnzVar)));
                            } else {
                                wu6 wu6VarK2 = k(iG);
                                lt6Var.q(2);
                                nv6.u(iH & 1048575, obj, lt6Var.o(wu6VarK2, zzgnzVar));
                                r(iG, obj);
                            }
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 10:
                            i = i5;
                            hv6Var = hv6Var2;
                            nv6.u(iH & 1048575, obj, lt6Var.u());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 11:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.s(obj, iH & 1048575, zzgnnVar.zzn());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 12:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            int iZzf = zzgnnVar.zzf();
                            zzgor zzgorVarJ = j(iG);
                            if (zzgorVarJ == null || zzgorVarJ.zza(iZzf)) {
                                nv6.s(obj, iH & 1048575, iZzf);
                                r(iG, obj);
                            } else {
                                Class cls = xu6.a;
                                Object objF = objA == null ? hv6Var.f() : objA;
                                hv6Var.l(objF, iZzf, iT);
                                objA = objF;
                            }
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 13:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(5);
                            nv6.s(obj, iH & 1048575, zzgnnVar.zzk());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 14:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(1);
                            nv6.t(obj, iH & 1048575, zzgnnVar.zzt());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 15:
                            i = i5;
                            hv6Var = hv6Var2;
                            lt6Var.q(0);
                            nv6.s(obj, iH & 1048575, zzgnnVar.zzl());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 16:
                            i = i5;
                            long j2 = iH & 1048575;
                            lt6Var.q(0);
                            hv6Var = hv6Var2;
                            nv6.t(obj, j2, zzgnnVar.zzu());
                            r(iG, obj);
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 17:
                            i = i5;
                            if (u(iG, obj)) {
                                long j3 = iH & 1048575;
                                Object objL2 = nv6.l(j3, obj);
                                wu6 wu6VarK3 = k(iG);
                                lt6Var.q(3);
                                nv6.u(j3, obj, zzgox.a(objL2, lt6Var.n(wu6VarK3, zzgnzVar)));
                            } else {
                                wu6 wu6VarK4 = k(iG);
                                lt6Var.q(3);
                                nv6.u(iH & 1048575, obj, lt6Var.n(wu6VarK4, zzgnzVar));
                                r(iG, obj);
                            }
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 18:
                            i = i5;
                            lt6Var.x(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 19:
                            i = i5;
                            lt6Var.b(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 20:
                            i = i5;
                            lt6Var.e(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 21:
                            i = i5;
                            lt6Var.m(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 22:
                            i = i5;
                            lt6Var.d(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 23:
                            i = i5;
                            lt6Var.a(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 24:
                            i = i5;
                            lt6Var.z(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 25:
                            i = i5;
                            lt6Var.v(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 26:
                            i = i5;
                            if ((536870912 & iH) != 0) {
                                lt6Var.k(true, du6Var.a(iH & 1048575, obj));
                            } else {
                                lt6Var.k(false, du6Var.a(iH & 1048575, obj));
                            }
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 27:
                            i = i5;
                            lt6Var.f(du6Var.a(iH & 1048575, obj), k(iG), zzgnzVar);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 28:
                            i = i5;
                            lt6Var.w(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 29:
                            i = i5;
                            lt6Var.l(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 30:
                            i = i5;
                            List listA = du6Var.a(iH & 1048575, obj);
                            lt6Var.y(listA);
                            objA = xu6.a(iT, listA, j(iG), objA, hv6Var2);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 31:
                            i = i5;
                            lt6Var.g(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 32:
                            i = i5;
                            lt6Var.h(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 33:
                            i = i5;
                            lt6Var.i(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 34:
                            i = i5;
                            lt6Var.j(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 35:
                            i = i5;
                            lt6Var.x(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 36:
                            i = i5;
                            lt6Var.b(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 37:
                            i = i5;
                            lt6Var.e(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 38:
                            i = i5;
                            lt6Var.m(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 39:
                            i = i5;
                            lt6Var.d(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 40:
                            i = i5;
                            lt6Var.a(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 41:
                            i = i5;
                            lt6Var.z(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 42:
                            i = i5;
                            lt6Var.v(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 43:
                            i = i5;
                            lt6Var.l(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 44:
                            i = i5;
                            List listA2 = du6Var.a(iH & 1048575, obj);
                            lt6Var.y(listA2);
                            objA = xu6.a(iT, listA2, j(iG), objA, hv6Var2);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 45:
                            i = i5;
                            lt6Var.g(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 46:
                            i = i5;
                            lt6Var.h(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 47:
                            i = i5;
                            lt6Var.i(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 48:
                            i = i5;
                            lt6Var.j(du6Var.a(iH & 1048575, obj));
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 49:
                            i = i5;
                            lt6Var.c(du6Var.a(iH & 1048575, obj), k(iG), zzgnzVar);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 50:
                            i = i5;
                            Object objM = m(iG);
                            long jH = h(iG) & 1048575;
                            Object objL3 = nv6.l(jH, obj);
                            if (objL3 == null) {
                                objL3 = zzgpr.zza().zzb();
                                nv6.u(jH, obj, objL3);
                            } else if (iu6.b(objL3)) {
                                Object objZzb = zzgpr.zza().zzb();
                                iu6.c(objZzb, objL3);
                                nv6.u(jH, obj, objZzb);
                                objL3 = objZzb;
                            }
                            throw null;
                        case 51:
                            i = i5;
                            lt6Var.q(1);
                            nv6.u(iH & 1048575, obj, Double.valueOf(zzgnnVar.zzb()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 52:
                            i = i5;
                            lt6Var.q(5);
                            nv6.u(iH & 1048575, obj, Float.valueOf(zzgnnVar.zzc()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 53:
                            i = i5;
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Long.valueOf(zzgnnVar.zzp()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 54:
                            i = i5;
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Long.valueOf(zzgnnVar.zzv()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 55:
                            i = i5;
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Integer.valueOf(zzgnnVar.zzh()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 56:
                            i = i5;
                            lt6Var.q(1);
                            nv6.u(iH & 1048575, obj, Long.valueOf(zzgnnVar.zzo()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 57:
                            i = i5;
                            lt6Var.q(5);
                            nv6.u(iH & 1048575, obj, Integer.valueOf(zzgnnVar.zzg()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 58:
                            i = i5;
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Boolean.valueOf(zzgnnVar.zzD()));
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 59:
                            i = i5;
                            q(obj, iH, lt6Var);
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 60:
                            if (v(iT, iG, obj)) {
                                long j4 = iH & 1048575;
                                Object objL4 = nv6.l(j4, obj);
                                wu6 wu6VarK5 = k(iG);
                                i = i5;
                                try {
                                    lt6Var.q(2);
                                    nv6.u(j4, obj, zzgox.a(objL4, lt6Var.o(wu6VarK5, zzgnzVar)));
                                } catch (zzgoy unused) {
                                    hv6Var = hv6Var2;
                                    hv6Var.q();
                                    if (objA == null) {
                                        objA = hv6Var.c(obj);
                                    }
                                    if (!hv6Var.p(objA, lt6Var)) {
                                        for (i3 = i; i3 < i4; i3++) {
                                            l(obj, iArr[i3], objA);
                                        }
                                        if (objA != null) {
                                            hv6Var.n(obj, objA);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    hv6Var = hv6Var2;
                                    for (i2 = i; i2 < i4; i2++) {
                                        l(obj, iArr[i2], objA);
                                    }
                                    if (objA != null) {
                                        hv6Var.n(obj, objA);
                                    }
                                    throw th;
                                }
                            } else {
                                i = i5;
                                wu6 wu6VarK6 = k(iG);
                                lt6Var.q(2);
                                nv6.u(iH & 1048575, obj, lt6Var.o(wu6VarK6, zzgnzVar));
                                r(iG, obj);
                            }
                            s(iT, iG, obj);
                            hv6Var = hv6Var2;
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 61:
                            nv6.u(iH & 1048575, obj, lt6Var.u());
                            s(iT, iG, obj);
                            break;
                        case 62:
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Integer.valueOf(zzgnnVar.zzn()));
                            s(iT, iG, obj);
                            break;
                        case 63:
                            lt6Var.q(0);
                            int iZzf2 = zzgnnVar.zzf();
                            zzgor zzgorVarJ2 = j(iG);
                            if (zzgorVarJ2 == null || zzgorVarJ2.zza(iZzf2)) {
                                nv6.u(iH & 1048575, obj, Integer.valueOf(iZzf2));
                                s(iT, iG, obj);
                            } else {
                                Class cls2 = xu6.a;
                                Object objF2 = objA == null ? hv6Var2.f() : objA;
                                hv6Var2.l(objF2, iZzf2, iT);
                                i = i5;
                                hv6Var = hv6Var2;
                                objA = objF2;
                            }
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                        case 64:
                            lt6Var.q(5);
                            nv6.u(iH & 1048575, obj, Integer.valueOf(zzgnnVar.zzk()));
                            s(iT, iG, obj);
                            break;
                        case 65:
                            lt6Var.q(1);
                            nv6.u(iH & 1048575, obj, Long.valueOf(zzgnnVar.zzt()));
                            s(iT, iG, obj);
                            break;
                        case 66:
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Integer.valueOf(zzgnnVar.zzl()));
                            s(iT, iG, obj);
                            break;
                        case 67:
                            lt6Var.q(0);
                            nv6.u(iH & 1048575, obj, Long.valueOf(zzgnnVar.zzu()));
                            s(iT, iG, obj);
                            break;
                        case 68:
                            long j5 = iH & 1048575;
                            try {
                                wu6 wu6VarK7 = k(iG);
                                lt6Var.q(3);
                                nv6.u(j5, obj, lt6Var.n(wu6VarK7, zzgnzVar));
                                s(iT, iG, obj);
                            } catch (zzgoy unused2) {
                                i = i5;
                                hv6Var = hv6Var2;
                                hv6Var.q();
                                if (objA == null) {
                                    objA = hv6Var.c(obj);
                                }
                                if (!hv6Var.p(objA, lt6Var)) {
                                    while (i3 < i4) {
                                        l(obj, iArr[i3], objA);
                                    }
                                    if (objA != null) {
                                        hv6Var.n(obj, objA);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        default:
                            i = i5;
                            hv6Var = hv6Var2;
                            if (objA == null) {
                                try {
                                    try {
                                        objA = hv6Var.f();
                                    } catch (zzgoy unused3) {
                                        hv6Var.q();
                                        if (objA == null) {
                                            objA = hv6Var.c(obj);
                                        }
                                        if (!hv6Var.p(objA, lt6Var)) {
                                            while (i3 < i4) {
                                                l(obj, iArr[i3], objA);
                                            }
                                            if (objA != null) {
                                                hv6Var.n(obj, objA);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (i2 < i4) {
                                        l(obj, iArr[i2], objA);
                                    }
                                    if (objA != null) {
                                        hv6Var.n(obj, objA);
                                    }
                                    throw th;
                                }
                            }
                            if (!hv6Var.p(objA, lt6Var)) {
                                for (int i7 = i; i7 < i4; i7++) {
                                    l(obj, iArr[i7], objA);
                                }
                                if (objA != null) {
                                    hv6Var.n(obj, objA);
                                    return;
                                }
                                return;
                            }
                            hv6Var2 = hv6Var;
                            i5 = i;
                            break;
                            break;
                    }
                } else {
                    if (iT == Integer.MAX_VALUE) {
                        while (i5 < i4) {
                            l(obj, iArr[i5], objA);
                            i5++;
                        }
                        if (objA != null) {
                            hv6Var2.n(obj, objA);
                            return;
                        }
                        return;
                    }
                    boolean z = this.f;
                    st6 st6Var = this.n;
                    if ((!z ? null : st6Var.c(zzgnzVar, this.e, iT)) != null) {
                        if (ut6VarB == null) {
                            ut6VarB = st6Var.b(obj);
                        }
                        objA = st6Var.d();
                    } else {
                        hv6Var2.q();
                        if (objA == null) {
                            objA = hv6Var2.c(obj);
                        }
                        if (!hv6Var2.p(objA, lt6Var)) {
                            while (i5 < i4) {
                                l(obj, iArr[i5], objA);
                                i5++;
                            }
                            if (objA != null) {
                                hv6Var2.n(obj, objA);
                                return;
                            }
                            return;
                        }
                    }
                }
                i = i5;
                hv6Var = hv6Var2;
                hv6Var2 = hv6Var;
                i5 = i;
            } catch (Throwable th3) {
                th = th3;
                i = i5;
            }
        }
    }

    public final int g(int i, int i2) {
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

    public final int h(int i) {
        return this.a[i + 1];
    }

    public final zzgor j(int i) {
        int i2 = i / 3;
        return (zzgor) this.b[i2 + i2 + 1];
    }

    public final wu6 k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        wu6 wu6Var = (wu6) objArr[i3];
        if (wu6Var != null) {
            return wu6Var;
        }
        wu6 wu6VarA = pu6.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = wu6VarA;
        return wu6VarA;
    }

    public final void l(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        Object objL = nv6.l(h(i) & 1048575, obj);
        if (objL == null || j(i) == null) {
            return;
        }
        throw null;
    }

    public final Object m(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final void o(int i, Object obj, Object obj2) {
        long jH = h(i) & 1048575;
        if (u(i, obj2)) {
            Object objL = nv6.l(jH, obj);
            Object objL2 = nv6.l(jH, obj2);
            if (objL != null && objL2 != null) {
                nv6.u(jH, obj, zzgox.a(objL, objL2));
                r(i, obj);
            } else if (objL2 != null) {
                nv6.u(jH, obj, objL2);
                r(i, obj);
            }
        }
    }

    public final void p(int i, Object obj, Object obj2) {
        int iH = h(i);
        int i2 = this.a[i];
        long j = iH & 1048575;
        if (v(i2, i, obj2)) {
            Object objL = v(i2, i, obj) ? nv6.l(j, obj) : null;
            Object objL2 = nv6.l(j, obj2);
            if (objL != null && objL2 != null) {
                nv6.u(j, obj, zzgox.a(objL, objL2));
                s(i2, i, obj);
            } else if (objL2 != null) {
                nv6.u(j, obj, objL2);
                s(i2, i, obj);
            }
        }
    }

    public final void q(Object obj, int i, lt6 lt6Var) throws zzgoy {
        if ((536870912 & i) != 0) {
            lt6Var.q(2);
            nv6.u(i & 1048575, obj, lt6Var.a.zzy());
        } else if (!this.g) {
            nv6.u(i & 1048575, obj, lt6Var.u());
        } else {
            lt6Var.q(2);
            nv6.u(i & 1048575, obj, lt6Var.a.zzx());
        }
    }

    public final void r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        nv6.s(obj, j, (1 << (i2 >>> 20)) | nv6.i(j, obj));
    }

    public final void s(int i, int i2, Object obj) {
        nv6.s(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final boolean t(int i, Object obj, Object obj2) {
        return u(i, obj) == u(i, obj2);
    }

    public final boolean u(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (nv6.i(j, obj) & (1 << (i2 >>> 20))) != 0;
        }
        int iH = h(i);
        long j2 = iH & 1048575;
        switch ((iH >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(nv6.g(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(nv6.h(j2, obj)) != 0;
            case 2:
                return nv6.j(j2, obj) != 0;
            case 3:
                return nv6.j(j2, obj) != 0;
            case 4:
                return nv6.i(j2, obj) != 0;
            case 5:
                return nv6.j(j2, obj) != 0;
            case 6:
                return nv6.i(j2, obj) != 0;
            case 7:
                return nv6.w(j2, obj);
            case 8:
                Object objL = nv6.l(j2, obj);
                if (objL instanceof String) {
                    return !((String) objL).isEmpty();
                }
                if (objL instanceof zzgnf) {
                    return !zzgnf.zzb.equals(objL);
                }
                throw new IllegalArgumentException();
            case 9:
                return nv6.l(j2, obj) != null;
            case 10:
                return !zzgnf.zzb.equals(nv6.l(j2, obj));
            case 11:
                return nv6.i(j2, obj) != 0;
            case 12:
                return nv6.i(j2, obj) != 0;
            case 13:
                return nv6.i(j2, obj) != 0;
            case 14:
                return nv6.j(j2, obj) != 0;
            case 15:
                return nv6.i(j2, obj) != 0;
            case 16:
                return nv6.j(j2, obj) != 0;
            case 17:
                return nv6.l(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(int i, int i2, Object obj) {
        return nv6.i((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void w(Object obj, ot6 ot6Var) {
        int i;
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iH = h(i3);
            int i6 = iArr[i3];
            int i7 = (iH >>> 20) & 255;
            Unsafe unsafe = p;
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
            long j = iH & i2;
            switch (i7) {
                case 0:
                    if ((i & i5) != 0) {
                        ot6Var.g(nv6.g(j, obj), i6);
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        ot6Var.k(nv6.h(j, obj), i6);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        ot6Var.n(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        ot6Var.d(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        ot6Var.m(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        ot6Var.j(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        ot6Var.i(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        ot6Var.e(i6, nv6.w(j, obj));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        x(i6, unsafe.getObject(obj, j), ot6Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        ot6Var.o(i6, k(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        ot6Var.f(i6, (zzgnf) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        ot6Var.c(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        ot6Var.h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        ot6Var.p(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        ot6Var.q(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        ot6Var.a(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        ot6Var.b(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        ot6Var.l(i6, k(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    xu6.e(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    xu6.i(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    xu6.l(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    xu6.u(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    xu6.k(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    xu6.h(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    xu6.g(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    xu6.c(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    xu6.r(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var);
                    break;
                case 27:
                    xu6.m(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, k(i3));
                    break;
                case 28:
                    xu6.d(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var);
                    break;
                case 29:
                    xu6.s(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 30:
                    xu6.f(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 31:
                    xu6.n(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 32:
                    xu6.o(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 33:
                    xu6.p(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 34:
                    xu6.q(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, false);
                    break;
                case 35:
                    xu6.e(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 36:
                    xu6.i(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 37:
                    xu6.l(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 38:
                    xu6.u(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 39:
                    xu6.k(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 40:
                    xu6.h(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 41:
                    xu6.g(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 42:
                    xu6.c(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 43:
                    xu6.s(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 44:
                    xu6.f(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 45:
                    xu6.n(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 46:
                    xu6.o(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 47:
                    xu6.p(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 48:
                    xu6.q(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, true);
                    break;
                case 49:
                    xu6.j(iArr[i3], (List) unsafe.getObject(obj, j), ot6Var, k(i3));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (v(i6, i3, obj)) {
                        ot6Var.g(((Double) nv6.l(j, obj)).doubleValue(), i6);
                    }
                    break;
                case 52:
                    if (v(i6, i3, obj)) {
                        ot6Var.k(((Float) nv6.l(j, obj)).floatValue(), i6);
                    }
                    break;
                case 53:
                    if (v(i6, i3, obj)) {
                        ot6Var.n(i6, i(j, obj));
                    }
                    break;
                case 54:
                    if (v(i6, i3, obj)) {
                        ot6Var.d(i6, i(j, obj));
                    }
                    break;
                case 55:
                    if (v(i6, i3, obj)) {
                        ot6Var.m(i6, E(j, obj));
                    }
                    break;
                case 56:
                    if (v(i6, i3, obj)) {
                        ot6Var.j(i6, i(j, obj));
                    }
                    break;
                case 57:
                    if (v(i6, i3, obj)) {
                        ot6Var.i(i6, E(j, obj));
                    }
                    break;
                case 58:
                    if (v(i6, i3, obj)) {
                        ot6Var.e(i6, ((Boolean) nv6.l(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (v(i6, i3, obj)) {
                        x(i6, unsafe.getObject(obj, j), ot6Var);
                    }
                    break;
                case 60:
                    if (v(i6, i3, obj)) {
                        ot6Var.o(i6, k(i3), unsafe.getObject(obj, j));
                    }
                    break;
                case 61:
                    if (v(i6, i3, obj)) {
                        ot6Var.f(i6, (zzgnf) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (v(i6, i3, obj)) {
                        ot6Var.c(i6, E(j, obj));
                    }
                    break;
                case 63:
                    if (v(i6, i3, obj)) {
                        ot6Var.h(i6, E(j, obj));
                    }
                    break;
                case 64:
                    if (v(i6, i3, obj)) {
                        ot6Var.p(i6, E(j, obj));
                    }
                    break;
                case 65:
                    if (v(i6, i3, obj)) {
                        ot6Var.q(i6, i(j, obj));
                    }
                    break;
                case 66:
                    if (v(i6, i3, obj)) {
                        ot6Var.a(i6, E(j, obj));
                    }
                    break;
                case 67:
                    if (v(i6, i3, obj)) {
                        ot6Var.b(i6, i(j, obj));
                    }
                    break;
                case 68:
                    if (v(i6, i3, obj)) {
                        ot6Var.l(i6, k(i3), unsafe.getObject(obj, j));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        hv6 hv6Var = this.m;
        hv6Var.r(hv6Var.d(obj), ot6Var);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0458  */
    /* JADX WARN: Code duplicated, block: B:145:0x0465  */
    /* JADX WARN: Code duplicated, block: B:147:0x0471  */
    /* JADX WARN: Code duplicated, block: B:150:0x048a  */
    /* JADX WARN: Code duplicated, block: B:151:0x048f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0483 A[SYNTHETIC] */
    public final int y(Object obj, byte[] bArr, int i, int i2, int i3, at6 at6Var) {
        Object obj2;
        Object obj3;
        int i4;
        int i5;
        int iG;
        int i6;
        int i7;
        int i8;
        int i9;
        at6 at6Var2;
        Object obj4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        byte[] bArr3;
        int i16;
        int iM;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        com5Fixed<T> com5Var = this;
        Object obj5 = obj;
        at6 at6Var3 = at6Var;
        Unsafe unsafe = p;
        byte[] bArr4 = bArr;
        int i24 = i;
        int i25 = i3;
        int i26 = i2;
        int i27 = -1;
        int i28 = 0;
        int i29 = 1048575;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i24 < i26) {
                int iK = i24 + 1;
                int i32 = bArr4[i24];
                if (i32 < 0) {
                    iK = bt6.k(i32, bArr4, iK, at6Var3);
                    i32 = at6Var3.a;
                }
                int i33 = i32 >>> 3;
                int i34 = i32 & 7;
                int i35 = i32;
                int i36 = com5Var.d;
                int i37 = i25;
                int i38 = com5Var.c;
                if (i33 > i27) {
                    iG = (i33 < i38 || i33 > i36) ? -1 : com5Var.g(i33, i28 / 3);
                    i6 = -1;
                } else {
                    iG = (i33 < i38 || i33 > i36) ? -1 : com5Var.g(i33, 0);
                    i6 = -1;
                }
                if (iG == i6) {
                    i7 = i29;
                    i8 = i33;
                    i4 = i35 == true ? 1 : 0;
                    i5 = i37;
                    i9 = 0;
                } else {
                    int[] iArr = com5Var.a;
                    int i39 = iArr[iG + 1];
                    int i40 = (i39 >>> 20) & 255;
                    long j = i39 & 1048575;
                    if (i40 <= 17) {
                        int i41 = iArr[iG + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i29) {
                            if (i29 != 1048575) {
                                unsafe.putInt(obj5, i29, i30);
                            }
                            i10 = unsafe.getInt(obj5, i43);
                            i11 = i43;
                        } else {
                            i10 = i30;
                            i11 = i29;
                        }
                        switch (i40) {
                            case 0:
                                at6Var3 = at6Var;
                                i12 = i11;
                                i13 = i35 == true ? 1 : 0;
                                byte[] bArr5 = bArr4;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 1) {
                                    nv6.q(obj5, j, Double.longBitsToDouble(bt6.n(iK, bArr5)));
                                    i15 = i13 == true ? 1 : 0;
                                    i24 = iK + 8;
                                    i10 |= i42;
                                    bArr4 = bArr;
                                    i26 = i2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i13;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 1:
                                at6Var3 = at6Var;
                                i12 = i11;
                                i13 = i35 == true ? 1 : 0;
                                bArr2 = bArr4;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 5) {
                                    nv6.r(obj5, j, Float.intBitsToFloat(bt6.b(bArr2, iK)));
                                    i24 = iK + 4;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i13;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 2:
                            case 3:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr3 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 0) {
                                    iM = bt6.m(bArr3, iK, at6Var3);
                                    long j2 = at6Var3.b;
                                    i15 = i16 == true ? 1 : 0;
                                    unsafe.putLong(obj, j, j2);
                                    i10 |= i42;
                                    bArr4 = bArr3;
                                    i24 = iM;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 4:
                            case 11:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 0) {
                                    i24 = bt6.j(bArr2, iK, at6Var3);
                                    unsafe.putInt(obj5, j, at6Var3.a);
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 5:
                            case 14:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 1) {
                                    unsafe.putLong(obj, j, bt6.n(iK, bArr2));
                                    i24 = iK + 8;
                                    i13 = i16 == true ? 1 : 0;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 6:
                            case 13:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 5) {
                                    unsafe.putInt(obj5, j, bt6.b(bArr2, iK));
                                    i24 = iK + 4;
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 7:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 0) {
                                    i24 = bt6.m(bArr2, iK, at6Var3);
                                    nv6.o(obj5, j, at6Var3.b != 0);
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 8:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 2) {
                                    i24 = (i39 & 536870912) == 0 ? bt6.g(bArr2, iK, at6Var3) : bt6.h(bArr2, iK, at6Var3);
                                    unsafe.putObject(obj5, j, at6Var3.c);
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 9:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 2) {
                                    i24 = bt6.d(com5Var.k(i9), bArr2, iK, i26, at6Var3);
                                    if ((i10 & i42) == 0) {
                                        unsafe.putObject(obj5, j, at6Var3.c);
                                    } else {
                                        unsafe.putObject(obj5, j, zzgox.a(unsafe.getObject(obj5, j), at6Var3.c));
                                    }
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 10:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 2) {
                                    i24 = bt6.a(bArr2, iK, at6Var3);
                                    unsafe.putObject(obj5, j, at6Var3.c);
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 12:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 0) {
                                    i24 = bt6.j(bArr2, iK, at6Var3);
                                    int i44 = at6Var3.a;
                                    zzgor zzgorVarJ = com5Var.j(i9);
                                    if (zzgorVarJ == null || zzgorVarJ.zza(i44)) {
                                        unsafe.putInt(obj5, j, i44);
                                        i13 = i16;
                                        i10 |= i42;
                                        i15 = i13;
                                    } else {
                                        z(obj).b(i16 == true ? 1 : 0, Long.valueOf(i44));
                                        i15 = i16 == true ? 1 : 0;
                                    }
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 15:
                                at6Var3 = at6Var;
                                i12 = i11;
                                bArr2 = bArr4;
                                i14 = i33;
                                i16 = i35 == true ? 1 : 0;
                                i9 = iG;
                                if (i34 == 0) {
                                    i24 = bt6.j(bArr2, iK, at6Var3);
                                    unsafe.putInt(obj5, j, zzgnn.zzF(at6Var3.a));
                                    i13 = i16;
                                    i10 |= i42;
                                    i15 = i13;
                                    bArr4 = bArr2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i16;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            case 16:
                                if (i34 == 0) {
                                    at6Var3 = at6Var;
                                    iM = bt6.m(bArr4, iK, at6Var3);
                                    long jZzG = zzgnn.zzG(at6Var3.b);
                                    i15 = i35 == true ? 1 : 0;
                                    i12 = i11;
                                    i14 = i33;
                                    bArr3 = bArr4;
                                    i9 = iG;
                                    unsafe.putLong(obj, j, jZzG);
                                    i10 |= i42;
                                    bArr4 = bArr3;
                                    i24 = iM;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i12 = i11;
                                    i14 = i33;
                                    i17 = i35 == true ? 1 : 0;
                                    i9 = iG;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                            default:
                                at6Var3 = at6Var;
                                i12 = i11;
                                i13 = i35 == true ? 1 : 0;
                                i9 = iG;
                                i14 = i33;
                                if (i34 == 3) {
                                    i15 = i13 == true ? 1 : 0;
                                    i24 = bt6.c(com5Var.k(i9), bArr, iK, i2, (i14 << 3) | 4, at6Var);
                                    if ((i10 & i42) == 0) {
                                        unsafe.putObject(obj5, j, at6Var3.c);
                                    } else {
                                        unsafe.putObject(obj5, j, zzgox.a(unsafe.getObject(obj5, j), at6Var3.c));
                                    }
                                    i10 |= i42;
                                    bArr4 = bArr;
                                    i26 = i2;
                                    i30 = i10;
                                    i29 = i12;
                                    i18 = i15;
                                } else {
                                    i17 = i13;
                                    i5 = i3;
                                    i4 = i17;
                                    i30 = i10;
                                    i7 = i12;
                                    i8 = i14;
                                }
                                break;
                        }
                    } else {
                        at6Var3 = at6Var;
                        i18 = i35 == true ? 1 : 0;
                        i9 = iG;
                        i14 = i33;
                        if (i40 != 27) {
                            i7 = i29;
                            if (i40 <= 49) {
                                i19 = i30;
                                int i45 = iK;
                                i21 = i9;
                                i8 = i14;
                                unsafe = unsafe;
                                i31 = i18 == true ? 1 : 0;
                                i24 = I(obj, bArr, iK, i2, i18 == true ? 1 : 0, i14, i34, i9, i39, i40, j, at6Var);
                                com5Var = this;
                                if (i24 != i45) {
                                    i23 = i21;
                                } else {
                                    i22 = i24;
                                    i23 = i21;
                                    i5 = i3;
                                    iK = i22;
                                    i4 = i31;
                                    i9 = i23;
                                    i30 = i19;
                                    if (i4 == i5 || i5 == 0) {
                                        if (com5Var.f) {
                                            at6Var2 = at6Var;
                                            obj4 = at6Var2.d;
                                            if (((zzgnz) obj4) != zzgnz.zza()) {
                                                i8 = i8;
                                                if (((zzgnz) obj4).zzc(com5Var.e, i8) == null) {
                                                    throw null;
                                                }
                                                i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                                                obj = obj;
                                            }
                                            bArr4 = bArr;
                                            i25 = i5;
                                            i31 = i4 == true ? 1 : 0;
                                            at6Var3 = at6Var2;
                                            i28 = i9;
                                            i27 = i8;
                                            com5Var = com5Var;
                                            i29 = i7;
                                            unsafe = unsafe;
                                            i26 = i2;
                                            obj5 = obj;
                                        } else {
                                            at6Var2 = at6Var;
                                        }
                                        i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                                        bArr4 = bArr;
                                        i25 = i5;
                                        i31 = i4 == true ? 1 : 0;
                                        at6Var3 = at6Var2;
                                        i28 = i9;
                                        i27 = i8;
                                        com5Var = com5Var;
                                        i29 = i7;
                                        unsafe = unsafe;
                                        i26 = i2;
                                        obj5 = obj;
                                    } else {
                                        obj2 = obj;
                                        i24 = iK;
                                        i29 = i7;
                                        obj3 = null;
                                    }
                                }
                            } else {
                                i19 = i30;
                                i20 = iK;
                                i21 = i9;
                                unsafe = unsafe;
                                i31 = i18 == true ? 1 : 0;
                                i8 = i14;
                                if (i40 != 50) {
                                    com5Var = this;
                                    i23 = i21;
                                    i24 = G(obj, bArr, i20, i2, i31 == true ? 1 : 0, i8, i34, i39, i40, j, i21, at6Var);
                                    if (i24 == i20) {
                                        i22 = i24;
                                    }
                                } else if (i34 == 2) {
                                    F(obj, i21, j);
                                    throw null;
                                }
                                i5 = i3;
                                iK = i22;
                                i4 = i31;
                                i9 = i23;
                                i30 = i19;
                                if (i4 == i5) {
                                }
                                if (com5Var.f) {
                                    at6Var2 = at6Var;
                                    obj4 = at6Var2.d;
                                    if (((zzgnz) obj4) != zzgnz.zza()) {
                                        i8 = i8;
                                        if (((zzgnz) obj4).zzc(com5Var.e, i8) == null) {
                                            throw null;
                                        }
                                        i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                                        obj = obj;
                                    }
                                    bArr4 = bArr;
                                    i25 = i5;
                                    i31 = i4 == true ? 1 : 0;
                                    at6Var3 = at6Var2;
                                    i28 = i9;
                                    i27 = i8;
                                    com5Var = com5Var;
                                    i29 = i7;
                                    unsafe = unsafe;
                                    i26 = i2;
                                    obj5 = obj;
                                } else {
                                    at6Var2 = at6Var;
                                }
                                i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                                bArr4 = bArr;
                                i25 = i5;
                                i31 = i4 == true ? 1 : 0;
                                at6Var3 = at6Var2;
                                i28 = i9;
                                i27 = i8;
                                com5Var = com5Var;
                                i29 = i7;
                                unsafe = unsafe;
                                i26 = i2;
                                obj5 = obj;
                            }
                            bArr4 = bArr;
                            i27 = i8;
                            i26 = i2;
                            i25 = i3;
                            at6Var3 = at6Var;
                            com5Var = com5Var;
                            i29 = i7;
                            i28 = i23;
                            i30 = i19;
                            unsafe = unsafe;
                            obj5 = obj;
                        } else if (i34 == 2) {
                            zzgow zzgowVarZzd = (zzgow) unsafe.getObject(obj5, j);
                            if (!zzgowVarZzd.zzc()) {
                                int size = zzgowVarZzd.size();
                                zzgowVarZzd = zzgowVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe.putObject(obj5, j, zzgowVarZzd);
                            }
                            i24 = bt6.e(com5Var.k(i9), i18 == true ? 1 : 0, bArr, iK, i2, zzgowVarZzd, at6Var);
                            bArr4 = bArr;
                            i26 = i2;
                            i29 = i29;
                        } else {
                            i7 = i29;
                            i19 = i30;
                            i20 = iK;
                            i21 = i9;
                            unsafe = unsafe;
                            i31 = i18 == true ? 1 : 0;
                            i8 = i14;
                        }
                        com5Var = this;
                        i22 = i20;
                        i23 = i21;
                        i5 = i3;
                        iK = i22;
                        i4 = i31;
                        i9 = i23;
                        i30 = i19;
                        if (i4 == i5) {
                        }
                        if (com5Var.f) {
                            at6Var2 = at6Var;
                            obj4 = at6Var2.d;
                            if (((zzgnz) obj4) != zzgnz.zza()) {
                                i8 = i8;
                                if (((zzgnz) obj4).zzc(com5Var.e, i8) == null) {
                                    throw null;
                                }
                                i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                                obj = obj;
                            }
                            bArr4 = bArr;
                            i25 = i5;
                            i31 = i4 == true ? 1 : 0;
                            at6Var3 = at6Var2;
                            i28 = i9;
                            i27 = i8;
                            com5Var = com5Var;
                            i29 = i7;
                            unsafe = unsafe;
                            i26 = i2;
                            obj5 = obj;
                        } else {
                            at6Var2 = at6Var;
                        }
                        i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                        bArr4 = bArr;
                        i25 = i5;
                        i31 = i4 == true ? 1 : 0;
                        at6Var3 = at6Var2;
                        i28 = i9;
                        i27 = i8;
                        com5Var = com5Var;
                        i29 = i7;
                        unsafe = unsafe;
                        i26 = i2;
                        obj5 = obj;
                    }
                    i25 = i3;
                    i28 = i9;
                    i31 = i18;
                    i27 = i14;
                }
                if (i4 == i5) {
                }
                if (com5Var.f) {
                    at6Var2 = at6Var;
                    obj4 = at6Var2.d;
                    if (((zzgnz) obj4) != zzgnz.zza()) {
                        i8 = i8;
                        if (((zzgnz) obj4).zzc(com5Var.e, i8) == null) {
                            throw null;
                        }
                        i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                        obj = obj;
                    }
                    bArr4 = bArr;
                    i25 = i5;
                    i31 = i4 == true ? 1 : 0;
                    at6Var3 = at6Var2;
                    i28 = i9;
                    i27 = i8;
                    com5Var = com5Var;
                    i29 = i7;
                    unsafe = unsafe;
                    i26 = i2;
                    obj5 = obj;
                } else {
                    at6Var2 = at6Var;
                }
                i24 = bt6.i((i4 == true ? 1 : 0) == true ? 1 : 0, bArr, iK, i2, z(obj), at6Var);
                bArr4 = bArr;
                i25 = i5;
                i31 = i4 == true ? 1 : 0;
                at6Var3 = at6Var2;
                i28 = i9;
                i27 = i8;
                com5Var = com5Var;
                i29 = i7;
                unsafe = unsafe;
                i26 = i2;
                obj5 = obj;
            } else {
                int i46 = i25;
                unsafe = unsafe;
                obj2 = obj5;
                com5Var = com5Var;
                obj3 = null;
                i4 = i31;
                i5 = i46;
            }
        }
        if (i29 != 1048575) {
            unsafe.putInt(obj2, i29, i30);
        }
        for (int i47 = com5Var.j; i47 < com5Var.k; i47++) {
            com5Var.l(obj2, com5Var.i[i47], obj3);
        }
        if (i5 == 0) {
            if (i24 != i2) {
                throw zzgoz.e();
            }
        } else if (i24 > i2 || i4 != i5) {
            throw zzgoz.e();
        }
        return i24;
    }

    @Override // defpackage.wu6
    public final int zza(Object obj) {
        return this.h ? D(obj) : C(obj);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d1  */
    @Override // defpackage.wu6
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int iHashCode;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iH = h(i3);
            int i4 = iArr[i3];
            long j = 1048575 & iH;
            switch ((iH >>> 20) & 255) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(Double.doubleToLongBits(nv6.g(j, obj)));
                    i2 = iZzc + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(nv6.h(j, obj));
                    i2 = iZzc + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(nv6.j(j, obj));
                    i2 = iZzc + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(nv6.j(j, obj));
                    i2 = iZzc + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(nv6.j(j, obj));
                    i2 = iZzc + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzgox.zza(nv6.w(j, obj));
                    i2 = iZzc + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) nv6.l(j, obj)).hashCode();
                    i2 = iZzc + i;
                    break;
                case 9:
                    Object objL = nv6.l(j, obj);
                    if (objL != null) {
                        iHashCode = objL.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = nv6.l(j, obj).hashCode();
                    i2 = iZzc + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(nv6.j(j, obj));
                    i2 = iZzc + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = nv6.i(j, obj);
                    i2 = iZzc + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzgox.zzc(nv6.j(j, obj));
                    i2 = iZzc + i;
                    break;
                case 17:
                    Object objL2 = nv6.l(j, obj);
                    if (objL2 != null) {
                        iHashCode = objL2.hashCode();
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
                    iZzc = nv6.l(j, obj).hashCode();
                    i2 = iZzc + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = nv6.l(j, obj).hashCode();
                    i2 = iZzc + i;
                    break;
                case 51:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(Double.doubleToLongBits(((Double) nv6.l(j, obj)).doubleValue()));
                        i2 = iZzc + i;
                    }
                    break;
                case 52:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(((Float) nv6.l(j, obj)).floatValue());
                        i2 = iZzc + i;
                    }
                    break;
                case 53:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(i(j, obj));
                        i2 = iZzc + i;
                    }
                    break;
                case 54:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(i(j, obj));
                        i2 = iZzc + i;
                    }
                    break;
                case 55:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 56:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(i(j, obj));
                        i2 = iZzc + i;
                    }
                    break;
                case 57:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 58:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zza(((Boolean) nv6.l(j, obj)).booleanValue());
                        i2 = iZzc + i;
                    }
                    break;
                case 59:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = ((String) nv6.l(j, obj)).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 60:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = nv6.l(j, obj).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 61:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = nv6.l(j, obj).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
                case 62:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 63:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 64:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 65:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(i(j, obj));
                        i2 = iZzc + i;
                    }
                    break;
                case 66:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = E(j, obj);
                        i2 = iZzc + i;
                    }
                    break;
                case 67:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = zzgox.zzc(i(j, obj));
                        i2 = iZzc + i;
                    }
                    break;
                case 68:
                    if (v(i4, i3, obj)) {
                        i = i2 * 53;
                        iZzc = nv6.l(j, obj).hashCode();
                        i2 = iZzc + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.m.d(obj).hashCode() + (i2 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        this.n.a(obj);
        throw null;
    }

    @Override // defpackage.wu6
    public final Object zze() {
        return ((zzgon) this.e).k(4, null);
    }

    @Override // defpackage.wu6
    public final void zzf(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long jH = h(iArr[i2]) & 1048575;
            Object objL = nv6.l(jH, obj);
            if (objL != null) {
                ((zzgpr) objL).zzc();
                nv6.u(jH, obj, objL);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.b(iArr[i], obj);
            i++;
        }
        this.m.m(obj);
        if (this.f) {
            this.n.e(obj);
        }
    }
}
