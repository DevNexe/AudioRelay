package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k64 implements xw2 {
    public final int w;
    public final List<k64> x;
    public Float y = null;
    public Float z = null;
    public w54 A = null;
    public w54 B = null;

    public k64(int i, ArrayList arrayList) {
        this.w = i;
        this.x = arrayList;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return this.x.contains(this);
    }
}
