package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class bm5 extends e70 {
    public ArrayList<e70> e0 = new ArrayList<>();

    @Override // defpackage.e70
    public void q() {
        this.e0.clear();
        super.q();
    }

    @Override // defpackage.e70
    public final void r(j95 j95Var) {
        super.r(j95Var);
        int size = this.e0.size();
        for (int i = 0; i < size; i++) {
            this.e0.get(i).r(j95Var);
        }
    }

    public void y() {
        ArrayList<e70> arrayList = this.e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e70 e70Var = this.e0.get(i);
            if (e70Var instanceof bm5) {
                ((bm5) e70Var).y();
            }
        }
    }
}
