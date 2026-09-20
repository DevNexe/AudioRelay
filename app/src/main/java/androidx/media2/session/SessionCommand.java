package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import defpackage.sh5;
import defpackage.uq2;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommand implements sh5 {
    public int a;
    public String b;
    public Bundle c;

    static {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        sparseArray.put(1, Arrays.asList(10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002));
        sparseArray2.put(1, Arrays.asList(10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018));
        sparseArray2.put(2, Collections.singletonList(10019));
        new SparseArray().put(1, Arrays.asList(30000, 30001));
        SparseArray sparseArray3 = new SparseArray();
        sparseArray3.put(1, Arrays.asList(40000, 40001, 40002, 40003, 40010));
        sparseArray3.put(2, Collections.singletonList(40011));
        new SparseArray().put(1, Arrays.asList(50000, 50001, 50002, 50003, 50004, 50005, 50006));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.a == sessionCommand.a && TextUtils.equals(this.b, sessionCommand.b);
    }

    public final int hashCode() {
        return uq2.b(this.b, Integer.valueOf(this.a));
    }
}
