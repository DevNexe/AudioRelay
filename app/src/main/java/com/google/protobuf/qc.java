package com.google.protobuf;

import defpackage.de5;
import defpackage.fe3;
import defpackage.i22;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qc {
    public static final QnHx a = new QnHx();
    public static final CQf b = new CQf();

    public static final class CQf extends qc {
        @Override // com.google.protobuf.qc
        public final void a(long j, Object obj) {
            ((SjP.LPt8Fixed) de5.o(j, obj)).i();
        }
    }

    public static final class QnHx extends qc {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        @Override // com.google.protobuf.qc
        public final void a(long j, Object obj) {
            Object objUnmodifiableList;
            List list = (List) de5.o(j, obj);
            if (list instanceof i22) {
                objUnmodifiableList = ((i22) list).t();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof fe3) && (list instanceof SjP.LPt8Fixed)) {
                    SjP.LPt8Fixed lPt8 = (SjP.LPt8Fixed) list;
                    if (lPt8.x()) {
                        lPt8.i();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            de5.v(j, obj, objUnmodifiableList);
        }
    }

    public abstract void a(long j, Object obj);
}
