package defpackage;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oc1 extends av4 {
    public oc1() {
        this(0);
    }

    public oc1(int i) {
        super(8);
    }

    @Override // defpackage.av4
    public final void h(String str) {
        List<String> list = rf1.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (ur1.b(cCharAt, 32) <= 0 || mv4.z("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.av4
    public final void i(String str) {
        List<String> list = rf1.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (cCharAt != ' ' && cCharAt != '\t' && ur1.b(cCharAt, 32) < 0) {
                throw new IllegalHeaderValueException(str, i2);
            }
            i++;
            i2 = i3;
        }
    }
}
