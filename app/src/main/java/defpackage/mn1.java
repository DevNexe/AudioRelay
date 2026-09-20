package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mn1 extends u83 {
    public final boolean l;

    public mn1(String str, nn1 nn1Var) {
        super(str, nn1Var, 1);
        this.l = true;
    }

    @Override // defpackage.u83
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mn1) {
            pa4 pa4Var = (pa4) obj;
            if (ur1.a(this.a, pa4Var.a())) {
                mn1 mn1Var = (mn1) obj;
                if (mn1Var.l && Arrays.equals((pa4[]) this.j.getValue(), (pa4[]) mn1Var.j.getValue())) {
                    int iF = pa4Var.f();
                    int i = this.c;
                    if (i == iF) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (ur1.a(j(i2).a(), pa4Var.j(i2).a()) && ur1.a(j(i2).e(), pa4Var.j(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.u83, defpackage.pa4
    public final boolean h() {
        return this.l;
    }

    @Override // defpackage.u83
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
