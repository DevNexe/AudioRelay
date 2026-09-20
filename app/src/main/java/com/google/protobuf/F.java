package com.google.protobuf;

import defpackage.hd2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements hd2 {
    public final int a;
    public final boolean b;
    public final int[] c;
    public final LPt6Fixed[] d;
    public final DzVS e;

    public static final class QnHx {
        public final ArrayList a;
        public int b;
        public boolean c;
        public boolean d;
        public int[] e = null;
        public Object f;

        public QnHx(int i) {
            this.a = new ArrayList(i);
        }

        public final F a() {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.b == 0) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.c = true;
            ArrayList arrayList = this.a;
            Collections.sort(arrayList);
            return new F(this.b, this.d, this.e, (LPt6Fixed[]) arrayList.toArray(new LPt6Fixed[0]), this.f);
        }

        public final void b(LPt6Fixed lPt6) {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.a.add(lPt6);
        }
    }

    public F(int i, boolean z, int[] iArr, LPt6Fixed[] lPt6Arr, Object obj) {
        this.a = i;
        this.b = z;
        this.c = iArr;
        this.d = lPt6Arr;
        Charset charset = SjP.a;
        if (obj == null) {
            throw new NullPointerException("defaultInstance");
        }
        this.e = (DzVS) obj;
    }

    @Override // defpackage.hd2
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.hd2
    public final DzVS b() {
        return this.e;
    }

    @Override // defpackage.hd2
    public final int c() {
        return this.a;
    }
}
