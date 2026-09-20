package com.google.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vq extends d_OZ<Object, Object> {
    public vq(int i) {
        super(i);
    }

    @Override // com.google.protobuf.d_OZ
    public final void h() {
        if (!this.z) {
            for (int i = 0; i < e(); i++) {
                Map.Entry<Object, Object> entryC = c(i);
                if (((Xn1.CQf) entryC.getKey()).f()) {
                    entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : f()) {
                if (((Xn1.CQf) entry.getKey()).f()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.h();
    }

    @Override // com.google.protobuf.d_OZ, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Xn1.CQf) obj, obj2);
    }
}
