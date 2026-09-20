package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n34 extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ long E;
    public final /* synthetic */ x81<g30, Integer, sd5> F;
    public final /* synthetic */ int G;
    public final /* synthetic */ y81<ay2, g30, Integer, sd5> H;
    public final /* synthetic */ bw4 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ x81<g30, Integer, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n34(bw4 bw4Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, int i, int i2, boolean z, int i3, long j, x81<? super g30, ? super Integer, sd5> x81Var4, int i4, y81<? super ay2, ? super g30, ? super Integer, sd5> y81Var) {
        super(1);
        this.w = bw4Var;
        this.x = x81Var;
        this.y = x81Var2;
        this.z = x81Var3;
        this.A = i;
        this.B = i2;
        this.C = z;
        this.D = i3;
        this.E = j;
        this.F = x81Var4;
        this.G = i4;
        this.H = y81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        long j;
        Object obj;
        Object obj2;
        gw0 gw0Var;
        Object obj3;
        Integer numValueOf;
        int iP0;
        int i;
        Object obj4;
        Object obj5;
        b43.QnHx qnHx2 = qnHx;
        q34 q34Var = q34.TopBar;
        x81<g30, Integer, sd5> x81Var = this.x;
        bw4 bw4Var = this.w;
        List<ob2> listF = bw4Var.F(q34Var, x81Var);
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        int i2 = 0;
        while (true) {
            j = this.E;
            if (i2 >= size) {
                break;
            }
            arrayList.add(listF.get(i2).y(j));
            i2++;
        }
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i3 = ((b43) obj).x;
            int iJ = ps0.J(arrayList);
            if (1 <= iJ) {
                int i4 = 1;
                while (true) {
                    Object obj6 = arrayList.get(i4);
                    int i5 = ((b43) obj6).x;
                    if (i3 < i5) {
                        obj = obj6;
                        i3 = i5;
                    }
                    if (i4 == iJ) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        b43 b43Var = (b43) obj;
        int i6 = b43Var != null ? b43Var.x : 0;
        List<ob2> listF2 = bw4Var.F(q34.Snackbar, this.y);
        ArrayList arrayList2 = new ArrayList(listF2.size());
        int size2 = listF2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList2.add(listF2.get(i7).y(j));
        }
        if (!arrayList2.isEmpty()) {
            obj2 = arrayList2.get(0);
            int i8 = ((b43) obj2).x;
            int iJ2 = ps0.J(arrayList2);
            if (1 <= iJ2) {
                int i9 = 1;
                while (true) {
                    Object obj7 = arrayList2.get(i9);
                    int i10 = ((b43) obj7).x;
                    if (i8 < i10) {
                        i8 = i10;
                        obj2 = obj7;
                    }
                    if (i9 == iJ2) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            obj2 = null;
        }
        b43 b43Var2 = (b43) obj2;
        int i11 = b43Var2 != null ? b43Var2.x : 0;
        List<ob2> listF3 = bw4Var.F(q34.Fab, this.z);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = listF3.iterator();
        while (it.hasNext()) {
            b43 b43VarY = ((ob2) it.next()).y(j);
            if (!((b43VarY.x == 0 || b43VarY.w == 0) ? false : true)) {
                b43VarY = null;
            }
            if (b43VarY != null) {
                arrayList3.add(b43VarY);
            }
        }
        if (!arrayList3.isEmpty()) {
            if (!arrayList3.isEmpty()) {
                obj4 = arrayList3.get(0);
                int i12 = ((b43) obj4).w;
                int iJ3 = ps0.J(arrayList3);
                if (1 <= iJ3) {
                    int i13 = 1;
                    while (true) {
                        Object obj8 = arrayList3.get(i13);
                        int i14 = ((b43) obj8).w;
                        if (i12 < i14) {
                            i12 = i14;
                            obj4 = obj8;
                        }
                        if (i13 == iJ3) {
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                obj4 = null;
            }
            int i15 = ((b43) obj4).w;
            if (!arrayList3.isEmpty()) {
                obj5 = arrayList3.get(0);
                int i16 = ((b43) obj5).x;
                int iJ4 = ps0.J(arrayList3);
                if (1 <= iJ4) {
                    int i17 = 1;
                    while (true) {
                        Object obj9 = arrayList3.get(i17);
                        int i18 = ((b43) obj9).x;
                        if (i16 < i18) {
                            i16 = i18;
                            obj5 = obj9;
                        }
                        if (i17 == iJ4) {
                            break;
                        }
                        i17++;
                    }
                }
            } else {
                obj5 = null;
            }
            int i19 = ((b43) obj5).x;
            boolean z = this.A == 1;
            int i20 = this.B;
            gw0Var = new gw0(z ? bw4Var.getLayoutDirection() == jy1.Ltr ? (i20 - bw4Var.p0(i34.b)) - i15 : bw4Var.p0(i34.b) : (i20 - i15) / 2, i19);
        } else {
            gw0Var = null;
        }
        q34 q34Var2 = q34.BottomBar;
        x81<g30, Integer, sd5> x81Var2 = this.F;
        int i21 = this.G;
        List<ob2> listF4 = bw4Var.F(q34Var2, X.n(1529070963, new m34(gw0Var, x81Var2, i21), true));
        ArrayList arrayList4 = new ArrayList(listF4.size());
        int size3 = listF4.size();
        int i22 = 0;
        while (i22 < size3) {
            arrayList4.add(listF4.get(i22).y(j));
            i22++;
            listF4 = listF4;
        }
        if (!arrayList4.isEmpty()) {
            obj3 = arrayList4.get(0);
            int i23 = ((b43) obj3).x;
            int iJ5 = ps0.J(arrayList4);
            if (1 <= iJ5) {
                int i24 = 1;
                while (true) {
                    Object obj10 = arrayList4.get(i24);
                    Object obj11 = obj3;
                    int i25 = ((b43) obj10).x;
                    if (i23 < i25) {
                        i23 = i25;
                        obj3 = obj10;
                    } else {
                        obj3 = obj11;
                    }
                    if (i24 == iJ5) {
                        break;
                    }
                    i24++;
                }
            }
        } else {
            obj3 = null;
        }
        b43 b43Var3 = (b43) obj3;
        int i26 = b43Var3 != null ? b43Var3.x : 0;
        if (gw0Var != null) {
            int i27 = gw0Var.b;
            if (i26 == 0) {
                iP0 = bw4Var.p0(i34.b);
            } else {
                if (this.C) {
                    i = (i27 / 2) + i26;
                } else {
                    i27 += i26;
                    iP0 = bw4Var.p0(i34.b);
                }
                numValueOf = Integer.valueOf(i);
            }
            i = i27 + iP0;
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        int iIntValue = i11 != 0 ? i11 + (numValueOf != null ? numValueOf.intValue() : i26) : 0;
        int i28 = this.D;
        int i29 = i28 - i6;
        Integer num = numValueOf;
        List<ob2> listF5 = bw4Var.F(q34.MainContent, X.n(-1132241596, new l34(bw4Var, i26, this.H, i21), true));
        long j2 = this.E;
        ArrayList arrayList5 = new ArrayList(listF5.size());
        int i30 = 0;
        for (int size4 = listF5.size(); i30 < size4; size4 = size4) {
            arrayList5.add(listF5.get(i30).y(g70.a(j2, 0, 0, 0, i29, 7)));
            i30++;
            i29 = i29;
            listF5 = listF5;
        }
        int size5 = arrayList5.size();
        for (int i31 = 0; i31 < size5; i31++) {
            b43.QnHx.c(qnHx2, (b43) arrayList5.get(i31), 0, i6);
        }
        int size6 = arrayList.size();
        for (int i32 = 0; i32 < size6; i32++) {
            b43.QnHx.c(qnHx2, (b43) arrayList.get(i32), 0, 0);
        }
        int size7 = arrayList2.size();
        for (int i33 = 0; i33 < size7; i33++) {
            b43.QnHx.c(qnHx2, (b43) arrayList2.get(i33), 0, i28 - iIntValue);
        }
        int size8 = arrayList4.size();
        for (int i34 = 0; i34 < size8; i34++) {
            b43.QnHx.c(qnHx2, (b43) arrayList4.get(i34), 0, i28 - i26);
        }
        if (gw0Var != null) {
            int size9 = arrayList3.size();
            for (int i35 = 0; i35 < size9; i35++) {
                b43.QnHx.c(qnHx2, (b43) arrayList3.get(i35), gw0Var.a, i28 - num.intValue());
            }
            sd5 sd5Var = sd5.a;
        }
        return sd5.a;
    }
}
