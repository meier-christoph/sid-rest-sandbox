/*
 * Copyright (C) 2014 - Christoph Meier.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package lu.sfeir.sid.rest.msg;

import com.google.common.base.Supplier;
import lu.sfeir.sid.rest.repo.core.ResourceIterator;
import org.jongo.MongoCollection;

public class MessageRepositoryImpl implements MessageRepository
{

    private final Supplier<MongoCollection> collection;

    public MessageRepositoryImpl(final Supplier<MongoCollection> collection)
    {
        this.collection = collection;
    }

    @Override
    public Iterable<Message> fetchAll()
    {
        return new ResourceIterator<Message>(collection.get()
                                                       .find("{_owner: #}", "test")
                                                       .as(MessageResource.class)
                                                       .iterator());
    }
}