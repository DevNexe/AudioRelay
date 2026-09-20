package defpackage;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {
    public static final m4 a = new m4();

    public final int a(ViewStructure viewStructure, int i) {
        return viewStructure.addChildCount(i);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        viewStructure.setId(i, str, str2, str3);
    }
}
