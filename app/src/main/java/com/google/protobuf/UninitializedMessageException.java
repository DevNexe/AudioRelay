package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {
    public final List<String> w;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public UninitializedMessageException(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        super(sb.toString());
        this.w = arrayList;
    }
}
