package com.google.protobuf;

import defpackage.lk;
import defpackage.vv0;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Aa extends WE {
    public final DzVS e;

    public static class CQf<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {
        public final Iterator<Map.Entry<K, Object>> w;

        public CQf(Iterator<Map.Entry<K, Object>> it) {
            this.w = it;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.w.next();
            return next.getValue() instanceof Aa ? new QnHx(next) : next;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            this.w.remove();
        }
    }

    public static class QnHx<K> implements Map.Entry<K, Object> {
        public final Map.Entry<K, Aa> w;

        public QnHx() {
            throw null;
        }

        public QnHx(Map.Entry entry) {
            this.w = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.w.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Aa value = this.w.getValue();
            if (value == null) {
                return null;
            }
            return value.c();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof DzVS)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            Aa value = this.w.getValue();
            DzVS dzVS = value.c;
            value.a = null;
            value.d = null;
            value.c = (DzVS) obj;
            return dzVS;
        }
    }

    public Aa(vv0 vv0Var, lk lkVar) {
        super(lkVar, vv0Var);
        this.e = null;
    }

    public final DzVS c() {
        return a(this.e);
    }

    @Override // com.google.protobuf.WE
    public final boolean equals(Object obj) {
        return c().equals(obj);
    }

    @Override // com.google.protobuf.WE
    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c().toString();
    }
}
