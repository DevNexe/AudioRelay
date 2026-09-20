package com.google.protobuf;

import defpackage.vv0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PRnFixed extends vv0 {
    public static final PRnFixed h = new PRnFixed(0);
    public final Map<String, CQf> d;
    public final Map<String, CQf> e;
    public final Map<QnHx, CQf> f;
    public final Map<QnHx, CQf> g;

    public static final class CQf {
    }

    public static final class QnHx {
        public final Descriptors.QnHx a;
        public final int b;

        public QnHx(Descriptors.QnHx qnHx, int i) {
            this.a = qnHx;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 65535) + this.b;
        }
    }

    public PRnFixed() {
        new HashMap();
        new HashMap();
        this.f = new HashMap();
        new HashMap();
    }

    public PRnFixed(int i) {
        super(vv0.c);
        this.d = Collections.emptyMap();
        this.e = Collections.emptyMap();
        this.f = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }
}
