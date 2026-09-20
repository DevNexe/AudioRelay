package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gj4 extends hj4.YKK {
    public final /* synthetic */ List b;
    public final /* synthetic */ Matrix c;

    public gj4(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // hj4.YKK
    public final void a(Matrix matrix, aj4 aj4Var, int i, Canvas canvas) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hj4.YKK) it.next()).a(this.c, aj4Var, i, canvas);
        }
    }
}
