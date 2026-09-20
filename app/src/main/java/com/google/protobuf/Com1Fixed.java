package com.google.protobuf;

import defpackage.oz2;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Com1Fixed<K, V> extends com.google.protobuf.QnHx {
    public volatile int A;
    public final K y;
    public final V z;

    public /* synthetic */ Com1Fixed() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Com1Fixed(Object obj, Object obj2) {
        this.A = -1;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        throw null;
    }

    @Override // com.google.protobuf.DzVS
    public final mw0t.QnHx c() {
        return new QnHx(this.y, this.z, true, true);
    }

    @Override // com.google.protobuf.roZB
    public final boolean d(Descriptors.NUlFixed nUl) {
        Descriptors.QnHx qnHx = nUl.D;
        throw null;
    }

    @Override // com.google.protobuf.roZB
    public final Descriptors.QnHx e() {
        throw null;
    }

    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        throw null;
    }

    @Override // com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        throw null;
    }

    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        if (this.A != -1) {
            return this.A;
        }
        throw null;
    }

    @Override // com.google.protobuf.roZB
    public final k k() {
        return k.x;
    }

    @Override // com.google.protobuf.roZB
    public final Object l(Descriptors.NUlFixed nUl) {
        Descriptors.QnHx qnHx = nUl.D;
        throw null;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        throw null;
    }

    @Override // com.google.protobuf.roZB
    public final Map<Descriptors.NUlFixed, Object> o() {
        new TreeMap();
        throw null;
    }

    @Override // com.google.protobuf.DzVS
    public final oz2<Com1Fixed<K, V>> p() {
        throw null;
    }

    public static class QnHx<K, V> extends com.google.protobuf.QnHx.AbstractC0099QnHx<QnHx<K, V>> {
        public K w;
        public V x;
        public boolean y;
        public boolean z;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Object obj, Object obj2, boolean z, boolean z2) {
            this.w = obj;
            this.x = obj2;
            this.y = z;
            this.z = z2;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Com1Fixed<K, V> f() {
            return new Com1Fixed<>(this.w, this.x);
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            throw null;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            Descriptors.QnHx qnHx = nUl.D;
            throw null;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            f();
            throw null;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return new QnHx(this.w, this.x, this.y, this.z);
        }

        @Override // com.google.protobuf.roZB
        public final boolean d(Descriptors.NUlFixed nUl) {
            Descriptors.QnHx qnHx = nUl.D;
            throw null;
        }

        @Override // com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            throw null;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // defpackage.jd2
        public final boolean isInitialized() {
            throw null;
        }

        @Override // com.google.protobuf.roZB
        public final k k() {
            return k.x;
        }

        @Override // com.google.protobuf.roZB
        public final Object l(Descriptors.NUlFixed nUl) {
            Descriptors.QnHx qnHx = nUl.D;
            throw null;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx m(Descriptors.NUlFixed nUl) {
            Descriptors.QnHx qnHx = nUl.D;
            throw null;
        }

        @Override // com.google.protobuf.roZB
        public final Map<Descriptors.NUlFixed, Object> o() {
            new TreeMap();
            throw null;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: r */
        public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
            return new QnHx(this.w, this.x, this.y, this.z);
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx y(k kVar) {
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            f();
            throw null;
        }
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        throw null;
    }

    @Override // com.google.protobuf.DzVS
    public final DzVS.QnHx c() {
        return new QnHx(this.y, this.z, true, true);
    }
}
