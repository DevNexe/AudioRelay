package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements DynamiteModule.QnHx {
    /* JADX WARN: Code duplicated, block: B:7:0x001c A[DONT_INVERT, PHI: r4
  0x001c: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.QnHx
    public final DynamiteModule.QnHx.CQf a(Context context, String str, DynamiteModule.QnHx.InterfaceC0076QnHx interfaceC0076QnHx) {
        DynamiteModule.QnHx.CQf cQf = new DynamiteModule.QnHx.CQf();
        cQf.a = interfaceC0076QnHx.b(context, str);
        int iA = interfaceC0076QnHx.a(context, str, true);
        cQf.b = iA;
        int i = cQf.a;
        if (i == 0) {
            i = 0;
            if (iA == 0) {
                cQf.c = 0;
            } else if (i >= iA) {
                cQf.c = -1;
            } else {
                cQf.c = 1;
            }
        } else if (i >= iA) {
            cQf.c = -1;
        } else {
            cQf.c = 1;
        }
        return cQf;
    }
}
