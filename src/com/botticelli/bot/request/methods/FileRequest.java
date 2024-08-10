package com.botticelli.bot.request.methods;

import com.botticelli.bot.request.methods.types.inputmedia.InputMedia;

import java.io.File;
import java.util.Iterator;

public interface FileRequest extends Request, Iterable<FormDataFileContainer>, Iterator<FormDataFileContainer> {

}
