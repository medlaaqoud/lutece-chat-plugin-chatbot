/*
 * Copyright (c) 2002-2017, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */

package fr.paris.lutece.plugins.chatbot.business;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatData
 */
public class ChatData
{
    private List<Post> _listPosts = new ArrayList<>( );
    
    public ChatData( String strWelcomeMessage )
    {
        if ( strWelcomeMessage != null && ! strWelcomeMessage.trim().equals( "" ) )
        {
            _listPosts.add( new BotPost( strWelcomeMessage ) );
        }
    }

    /**
     * Add a post
     * 
     * @param post
     *            The post
     */
    public void addPost( Post post )
    {
        _listPosts.add( post );
    }

    /**
     * Add a post
     * 
     * @param post
     *            The Post
     */
    public void addBotPost( BotPost post )
    {
        addPost( post );
    }

    /**
     * Add a post
     * 
     * @param strContent
     *            The content
     */
    public void addUserPost( String strContent )
    {
        Post post = new Post( );
        post.setContent( strContent );
        post.setContentType( Post.CONTENT_TYPE_TEXT );
        post.setAuthor( Post.AUTHOR_USER );
        addPost( post );
    }

    /**
     * The post list
     * 
     * @return The list of all posts
     */
    public List<Post> getPosts( )
    {
        return _listPosts;
    }

}
