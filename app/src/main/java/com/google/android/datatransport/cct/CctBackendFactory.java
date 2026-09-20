package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.f5;
import defpackage.kc0;
import defpackage.ta5;
import defpackage.vn;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements f5 {
    @Override // defpackage.f5
    public ta5 create(kc0 kc0Var) {
        return new vn(kc0Var.a(), kc0Var.d(), kc0Var.c());
    }
}
