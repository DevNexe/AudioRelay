package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sk3 extends cx1 implements j81<k40, sd5> {
    public final /* synthetic */ tk3 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ uh1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk3(tk3 tk3Var, int i, uh1 uh1Var) {
        super(1);
        this.w = tk3Var;
        this.x = i;
        this.y = uh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // defpackage.j81
    public final sd5 invoke(k40 k40Var) {
        vh1 vh1Var;
        k40 k40Var2 = k40Var;
        tk3 tk3Var = this.w;
        int i = tk3Var.e;
        int i2 = this.x;
        if (i == i2) {
            uh1 uh1Var = tk3Var.f;
            uh1 uh1Var2 = this.y;
            if (ur1.a(uh1Var2, uh1Var) && (k40Var2 instanceof n40)) {
                int i3 = uh1Var2.a;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    Object obj = ((Object[]) uh1Var2.b)[i4];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    int i6 = ((int[]) uh1Var2.c)[i4];
                    boolean z = i6 != i2;
                    if (z) {
                        n40 n40Var = (n40) k40Var2;
                        xh1<tk3> xh1Var = n40Var.C;
                        xh1Var.c(obj, tk3Var);
                        vj0<?> vj0Var = obj instanceof vj0 ? (vj0) obj : null;
                        if (vj0Var == null) {
                            k40Var2 = k40Var2;
                        } else {
                            if (!(xh1Var.b(vj0Var) >= 0)) {
                                n40Var.E.d(vj0Var);
                            }
                            vh1 vh1Var2 = tk3Var.g;
                            if (vh1Var2 != null) {
                                int iA = vh1Var2.a(vj0Var);
                                if (iA >= 0) {
                                    int i7 = vh1Var2.a;
                                    Object[] objArr = (Object[]) vh1Var2.b;
                                    Object[] objArr2 = (Object[]) vh1Var2.c;
                                    int i8 = iA + 1;
                                    int i9 = i7 - i8;
                                    System.arraycopy(objArr, i8, objArr, iA, i9);
                                    System.arraycopy(objArr2, i8, objArr2, iA, i9);
                                    int i10 = i7 - 1;
                                    vh1Var = null;
                                    objArr[i10] = null;
                                    objArr2[i10] = null;
                                    vh1Var2.a = i10;
                                } else {
                                    vh1Var = null;
                                }
                                if (vh1Var2.a == 0) {
                                    tk3Var.g = vh1Var;
                                }
                            } else {
                                k40Var2 = k40Var2;
                            }
                        }
                    } else {
                        k40Var2 = k40Var2;
                    }
                    if (!z) {
                        if (i5 != i4) {
                            ((Object[]) uh1Var2.b)[i5] = obj;
                            ((int[]) uh1Var2.c)[i5] = i6;
                        }
                        i5++;
                    }
                    i4++;
                    k40Var2 = k40Var2;
                }
                int i11 = uh1Var2.a;
                for (int i12 = i5; i12 < i11; i12++) {
                    ((Object[]) uh1Var2.b)[i12] = null;
                }
                uh1Var2.a = i5;
                if (i5 == 0) {
                    tk3Var.f = null;
                }
            }
        }
        return sd5.a;
    }
}
