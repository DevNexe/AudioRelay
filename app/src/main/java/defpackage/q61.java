package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum q61 {
    x("TEXT"),
    y("BINARY"),
    z("CLOSE"),
    A("PING"),
    B("PONG");

    public final int w;

    static {
        q61 q61Var;
        q61[] q61VarArrValues = values();
        if (q61VarArrValues.length == 0) {
            q61Var = null;
        } else {
            q61Var = q61VarArrValues[0];
            int length = q61VarArrValues.length - 1;
            if (length != 0) {
                int i = q61Var.w;
                op1 it = new pp1(1, length).iterator();
                while (it.y) {
                    q61 q61Var2 = q61VarArrValues[it.nextInt()];
                    int i2 = q61Var2.w;
                    if (i < i2) {
                        q61Var = q61Var2;
                        i = i2;
                    }
                }
            }
        }
        int i3 = q61Var.w + 1;
        q61[] q61VarArr = new q61[i3];
        int i4 = 0;
        while (i4 < i3) {
            q61[] q61VarArrValues2 = values();
            int length2 = q61VarArrValues2.length;
            q61 q61Var3 = null;
            int i5 = 0;
            boolean z2 = false;
            while (true) {
                if (i5 >= length2) {
                    if (z2) {
                        break;
                    }
                } else {
                    q61 q61Var4 = q61VarArrValues2[i5];
                    if (q61Var4.w == i4) {
                        if (!z2) {
                            q61Var3 = q61Var4;
                            z2 = true;
                        }
                    }
                    i5++;
                }
                q61Var3 = null;
                break;
            }
            q61VarArr[i4] = q61Var3;
            i4++;
        }
    }

    q61(String str) {
        this.w = i;
    }
}
