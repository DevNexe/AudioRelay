package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o70 implements cw4, qf6 {
    public static ej1 y;
    public static ej1 z;
    public static final int[] w = new int[0];
    public static final Object[] x = new Object[0];
    public static final o70 A = new o70();
    public static final /* synthetic */ o70 B = new o70();

    public static int c(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int d(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final w93 e(View view) {
        w93 w93Var = (w93) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (w93Var != null) {
            return w93Var;
        }
        w93 w93Var2 = new w93();
        view.setTag(R.id.pooling_container_listener_holder_tag, w93Var2);
        return w93Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List f(String str) {
        uy2 uy2Var;
        uy2 uy2Var2;
        cs0 cs0Var = cs0.w;
        if (str == null) {
            return cs0Var;
        }
        int i = 3;
        oz1 oz1VarH = qLd.h(3, of1.w);
        int i2 = 0;
        while (i2 <= mv4.B(str)) {
            oz1 oz1VarH2 = qLd.h(i, pf1.w);
            Integer numValueOf = null;
            int i3 = i2;
            while (true) {
                if (i3 > mv4.B(str)) {
                    ((ArrayList) oz1VarH.getValue()).add(new ic1(h(i2, numValueOf != null ? numValueOf.intValue() : i3, str), oz1VarH2.isInitialized() ? (List) oz1VarH2.getValue() : cs0Var));
                    break;
                }
                char cCharAt = str.charAt(i3);
                if (cCharAt == ',') {
                    ((ArrayList) oz1VarH.getValue()).add(new ic1(h(i2, numValueOf != null ? numValueOf.intValue() : i3, str), oz1VarH2.isInitialized() ? (List) oz1VarH2.getValue() : cs0Var));
                    i3++;
                    break;
                }
                if (cCharAt == ';') {
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i3);
                    }
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        if (i5 <= mv4.B(str)) {
                            char cCharAt2 = str.charAt(i5);
                            boolean z2 = true;
                            if (cCharAt2 == '=') {
                                int i6 = i5 + 1;
                                if (str.length() == i6) {
                                    uy2Var2 = new uy2(Integer.valueOf(i6), "");
                                } else {
                                    char c = '\"';
                                    if (str.charAt(i6) == '\"') {
                                        int i7 = i6 + 1;
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            if (i7 > mv4.B(str)) {
                                                uy2Var2 = new uy2(Integer.valueOf(i7), "\"".concat(sb.toString()));
                                                break;
                                            }
                                            char cCharAt3 = str.charAt(i7);
                                            if (cCharAt3 == c) {
                                                int i8 = i7 + 1;
                                                int i9 = i8;
                                                while (i9 < str.length() && str.charAt(i9) == ' ') {
                                                    i9++;
                                                }
                                                if (i9 == str.length() || str.charAt(i9) == ';') {
                                                    uy2Var2 = new uy2(Integer.valueOf(i8), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i7 >= mv4.B(str) - 2) {
                                                sb.append(cCharAt3);
                                                i7++;
                                            } else {
                                                sb.append(str.charAt(i7 + 1));
                                                i7 += 2;
                                            }
                                            c = '\"';
                                        }
                                    } else {
                                        int i10 = i6;
                                        while (true) {
                                            if (i10 > mv4.B(str)) {
                                                uy2Var = new uy2(Integer.valueOf(i10), h(i6, i10, str));
                                                break;
                                            }
                                            char cCharAt4 = str.charAt(i10);
                                            if (cCharAt4 == ';' || cCharAt4 == ',') {
                                                uy2Var = new uy2(Integer.valueOf(i10), h(i6, i10, str));
                                                break;
                                            }
                                            i10++;
                                        }
                                        uy2Var2 = uy2Var;
                                    }
                                }
                                int iIntValue = ((Number) uy2Var2.w).intValue();
                                g(oz1VarH2, str, i4, i5, (String) uy2Var2.x);
                                i3 = iIntValue;
                                break;
                            }
                            if (cCharAt2 != ';' && cCharAt2 != ',') {
                                z2 = false;
                            }
                            if (z2) {
                                g(oz1VarH2, str, i4, i5, "");
                            } else {
                                i5++;
                            }
                        } else {
                            g(oz1VarH2, str, i4, i5, "");
                        }
                        i3 = i5;
                        break;
                    }
                }
                i3++;
            }
            i2 = i3;
            i = 3;
        }
        return oz1VarH.isInitialized() ? (List) oz1VarH.getValue() : cs0Var;
    }

    public static final void g(oz1 oz1Var, String str, int i, int i2, String str2) {
        String strH = h(i, i2, str);
        if (strH.length() == 0) {
            return;
        }
        ((ArrayList) oz1Var.getValue()).add(new jc1(strH, str2));
    }

    public static final String h(int i, int i2, String str) {
        return mv4.W(str.substring(i, i2)).toString();
    }

    @Override // defpackage.cw4
    public void a(cw4.QnHx qnHx) {
        qnHx.clear();
    }

    @Override // defpackage.cw4
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(c87.x.zza().zzl());
    }
}
