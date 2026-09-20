package com.google.android.material.appbar;

import android.view.View;
import defpackage.PFC;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 implements PFC {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public F1(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.PFC
    public final boolean a(View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}
